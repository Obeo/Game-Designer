package fr.obeo.dsl.game;

/**
 * {@link Game} utility class.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 * 
 */
public final class GameUtils {

	/**
	 * Constructor.
	 */
	private GameUtils() {
		// nothing to do here
	}

	/**
	 * Gets the {@link Animation} with the given {@link Animation#getName()
	 * name} in the given {@link Sheet}.
	 * 
	 * @param sheet
	 *            the {@link Sheet}
	 * @param animationName
	 *            the {@link Animation#getName() name}
	 * @return the {@link Animation} with the given {@link Animation#getName()
	 *         name} if any, <code>null</code> otherwise
	 */
	public static Animation getAnimation(Sheet sheet, String animationName) {
		Animation res = null;

		for (Animation animation : sheet.getAnimations()) {
			if (animation.getName().equals(animationName)) {
				res = animation;
				break;
			}
		}

		return res;
	}

	/**
	 * Gets Gets the {@link HitBox} with the given {@link HitBox#getName() name}
	 * in the given {@link Sprite}.
	 * 
	 * @param sprite
	 *            the {@link Sprite}
	 * @param hitboxName
	 *            the {@link HitBox#getName() name}
	 * @return the {@link HitBox} with the given {@link HitBox#getName() name}
	 *         in the given {@link Sprite} if any, <code>null</code> otherwise
	 */
	public static HitBox getHitbox(Sprite sprite, String hitboxName) {
		HitBox res = null;

		for (HitBox hitbox : sprite.getHitboxes()) {
			if (hitbox.getName().equals(hitboxName)) {
				res = hitbox;
				break;
			}
		}

		return res;
	}

	/**
	 * Gets the {@link Sheet} with the given {@link Sheet#getName() name} in the
	 * given {@link Game}.
	 * 
	 * @param game
	 *            the {@link Game}
	 * @param sheetName
	 *            the {@link Sheet#getName() name}
	 * @return the {@link Sheet} with the given {@link Sheet#getName() name} in
	 *         the given {@link Game} if any, <code>null</code> otherwise
	 */
	public static Sheet getSheet(Game game, String sheetName) {
		Sheet res = null;

		for (Sheet sheet : game.getSheets()) {
			if (sheetName.equals(sheet.getName())) {
				res = sheet;
			}
		}

		return res;
	}

	/**
	 * Gets the {@link Sprite} with the given {@link Sprite#getClassName() class
	 * name} in the given {@link Game}.
	 * 
	 * @param game
	 *            the {@link Game}
	 * @param spriteName
	 *            the {@link Sprite#getClassName() class name}
	 * @return the {@link Sprite} with the given {@link Sprite#getClassName()
	 *         class name} in the given {@link Game} if anu, <code>null</code>
	 *         otherwise
	 */
	public static Sprite getSpriteByClassName(Game game, String spriteName) {
		Sprite res = null;

		for (Sprite sprite : game.getSprites()) {
			if (spriteName.equals(sprite.getClassName())) {
				res = sprite;
			}
		}

		return res;
	}

}
