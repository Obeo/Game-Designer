package fr.obeo.generator.game;

import java.io.File;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import fr.obeo.dsl.game.Animation;
import fr.obeo.dsl.game.Game;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.GameUtils;
import fr.obeo.dsl.game.HitBox;
import fr.obeo.dsl.game.Property;
import fr.obeo.dsl.game.Sheet;
import fr.obeo.dsl.game.Sprite;
import fr.obeo.dsl.game.State;
import fr.obeo.dsl.game.TMX;
import fr.obeo.dsl.game.Tile;

/**
 * Handle <a href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format">TMX</a>
 * parsing.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 * 
 */
public class TMXHandler extends DefaultHandler {

	/**
	 * The game folder.
	 */
	private final File file;

	/**
	 * The {@link Game}.
	 */
	private final Game game;

	/**
	 * The resulting {@link TMX}.
	 */
	private final TMX tmx;

	/**
	 * Tells if we are currently in a <a
	 * href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format#tileset"
	 * >tileset</a>.
	 */
	private boolean inTileSet;

	/**
	 * The current tile id.
	 */
	private String tileID;

	/**
	 * Tells if we are currently in a <a
	 * href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format#tile"
	 * >tile</a>.
	 */
	private boolean inTile;

	/**
	 * {@link Set} of created {@link Sprite} for the current {@link Sheet}.
	 */
	private Set<Sprite> createdSprites = new HashSet<Sprite>();

	/**
	 * The current {@link Sheet}'s {@link Sheet#getName() name}.
	 */
	private String sheetName;

	/**
	 * Current tile properties.
	 */
	private final Properties tileProperties = new Properties();

	/**
	 * Current tileset properties.
	 */
	private final Properties tileSetProperties = new Properties();

	/**Constructor.
	 * @param file the game folder
	 * @param game the {@link Game}
	 * @param tmx the {@link TMX}
	 */
	public TMXHandler(File file, Game game, TMX tmx) {
		this.file = file;
		this.game = game;
		this.tmx = tmx;
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equals("tileset")) {
			inTileSet = true;
		} else if (inTileSet) {
			if (qName.equals("image")) {
				final String source = attributes.getValue("source");
				final String[] segments = source.split("/");
				sheetName = segments[segments.length - 1].substring(0,
						segments[segments.length - 1].lastIndexOf('.'));
				final File imageFile = new File(file.getAbsolutePath()
						+ System.getProperty("file.separator") + source);
				if (!imageFile.exists()) {
					System.out
							.println("Missing " + imageFile.getAbsolutePath());
				}
			} else if (qName.equals("tile")) {
				inTile = true;
				tileID = attributes.getValue("id");
			} else if (qName.equals("property")) {
				if (inTile) {
					tileProperties.put(attributes.getValue("name"),
							attributes.getValue("value"));
				} else {
					tileSetProperties.put(attributes.getValue("name"),
							attributes.getValue("value"));
				}
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (inTileSet) {
			if (qName.equals("tileset")) {
				if (createdSprites.size() != 0 || tileSetProperties.size() != 0) {
					Sheet sheet = GameUtils.getSheet(game, sheetName);
					if (sheet == null) {
						sheet = GamePackage.eINSTANCE.getGameFactory()
								.createSheet();
						sheet.setName(sheetName);
						game.getSheets().add(sheet);
					}
					for (String propertyName : tileSetProperties
							.stringPropertyNames()) {
						if (propertyName.startsWith("animation_")
								&& GameUtils.getAnimation(sheet, propertyName) != null) {
							final Animation animation = GamePackage.eINSTANCE
									.getGameFactory().createAnimation();
							animation.setName(propertyName);
							animation.setValue(tileSetProperties
									.getProperty(propertyName));
							sheet.getAnimations().add(animation);
						}
					}
					for (Sprite sprite : createdSprites) {
						sprite.setSheet(sheet);
					}
					final File jsonFile = new File(file.getAbsolutePath()
							+ System.getProperty("file.separator") + sheetName
							+ ".json");
					if (!jsonFile.exists()) {
						System.out.println("Missing "
								+ jsonFile.getAbsolutePath());
					}
				}
				inTileSet = false;
				tileSetProperties.clear();
				createdSprites.clear();
			} else if (qName.equals("tile")) {
				if (tileProperties.stringPropertyNames().contains("sensor")) {
					tileProperties.remove("sensor");
					// properties.remove("sprite");
					final Tile tile = GamePackage.eINSTANCE.getGameFactory()
							.createTile();
					tile.setId(tileID);
					for (String propertyName : tileProperties
							.stringPropertyNames()) {
						final Property property = GamePackage.eINSTANCE
								.getGameFactory().createProperty();
						property.setName(propertyName);
						tile.getProperties().add(property);
					}
					tmx.getTiles().add(tile);
				} else if (tileProperties.stringPropertyNames().contains(
						"Class")) {
					Sprite sprite = GameUtils.getSpriteByClassName(game,
							tileProperties.getProperty("Class"));
					if (sprite == null) {
						sprite = GamePackage.eINSTANCE.getGameFactory()
								.createSprite();
						sprite.setName(tileProperties.getProperty("sprite"));
						createdSprites.add(sprite);
						final State state = GamePackage.eINSTANCE
								.getGameFactory().createState();
						state.setName("default " + sprite.getName());
						sprite.getStates().add(state);
						sprite.setDefaultState(state);
						sprite.setClassName(tileProperties.getProperty("Class"));
						tileProperties.remove("sprite");
						tileProperties.remove("Class");
						for (String propertyName : tileProperties
								.stringPropertyNames()) {
							if (propertyName.startsWith("hitbox_")
									&& GameUtils
											.getHitbox(sprite, propertyName) != null) {
								final HitBox hitbox = GamePackage.eINSTANCE
										.getGameFactory().createHitBox();
								hitbox.setName(propertyName);
								sprite.getHitboxes().add(hitbox);
							} else {
								final Property property = GamePackage.eINSTANCE
										.getGameFactory().createProperty();
								property.setName(propertyName);
								sprite.getProperties().add(property);
							}
						}
						game.getSprites().add(sprite);
					}
					tmx.getSprites().add(sprite);
				}
				inTile = false;
				tileProperties.clear();
			}
		}
	}

}
