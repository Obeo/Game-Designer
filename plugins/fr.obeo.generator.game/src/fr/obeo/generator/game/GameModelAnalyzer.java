package fr.obeo.generator.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.xml.sax.SAXException;

import fr.obeo.dsl.game.Game;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Sound;
import fr.obeo.dsl.game.TMX;

/**
 * This class parse a <a
 * href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format">TMX</a> file to
 * initialize a {@link Game}. It also looks for audio files. The game folder
 * strcuture is described by the <a
 * href="http://html5quintus.com/documentation">Quintus</a> framework.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 * 
 */
public class GameModelAnalyzer {

	/**
	 * @param args
	 *            "game folder" "output game model"
	 */
	public static void main(String[] args) {
		final File gameModel = new File(args[1]);

		final Game game = GamePackage.eINSTANCE.getGameFactory().createGame();
		final String[] segments = args[0].split(Pattern.quote(System
				.getProperty("file.separator")));
		game.setName(segments[segments.length - 1]);

		game.getSounds().addAll(
				getSound(new File(args[0]
						+ System.getProperty("file.separator") + "audio")));
		game.getScenes().addAll(
				getTMX(new File(args[0] + System.getProperty("file.separator")
						+ "data"), game));

		final Resource r = new XMIResourceImpl();
		r.getContents().add(game);
		try {
			r.save(new FileOutputStream(gameModel), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Browses and parses <a
	 * href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format">TMX</a> files
	 * in the <code>data</code> folder.
	 * 
	 * @param file
	 *            the <code>data</code> folder
	 * @param game
	 *            the output {@link Game}
	 * @return loaded {@link TMX}
	 */
	private static Collection<TMX> getTMX(File file, Game game) {
		final List<TMX> res = new ArrayList<TMX>();

		final String[] names = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".tmx");
			}
		});

		for (String name : names) {
			res.add(readTMX(
					new File(file.getAbsolutePath()
							+ System.getProperty("file.separator") + name),
					game));
		}

		return res;
	}

	/**
	 * Parses the given <a
	 * href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format">TMX</a> file.
	 * 
	 * @param file
	 *            the <a
	 *            href="https://github.com/bjorn/tiled/wiki/TMX-Map-Format"
	 *            >TMX</a> file
	 * @param game
	 *            the {@link Game}
	 * @return the parsed {@link TMX}
	 */
	private static TMX readTMX(File file, Game game) {
		final TMX res = GamePackage.eINSTANCE.getGameFactory().createTMX();

		res.setName(file.getName()
				.substring(0, file.getName().lastIndexOf('.')));

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser;
		try {
			parser = factory.newSAXParser();
			parser.parse(file, new TMXHandler(file.getParentFile(), game, res));
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;
	}

	/**
	 * Searches for sound (<code>.wav</code>, <code>.mp3</code>,
	 * <code>.ogg</code> ) files
	 * 
	 * @param file
	 *            the <code>audio</code> folder
	 * @return found {@link Sound}
	 */
	private static Set<Sound> getSound(File file) {
		final Set<Sound> res = new HashSet<Sound>();

		final String[] names = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".mp3") || name.endsWith(".wav")
						|| name.endsWith(".ogg");
			}
		});

		Set<String> mp3 = new HashSet<String>();
		Set<String> wav = new HashSet<String>();
		Set<String> ogg = new HashSet<String>();
		Set<String> soundNames = new HashSet<String>();
		for (String name : names) {
			final String extension = name.substring(name.lastIndexOf('.'));
			final String soundName = name.substring(0, name.lastIndexOf('.'));
			if (extension.equals(".mp3")) {
				mp3.add(soundName);
			} else if (extension.equals(".wav")) {
				wav.add(soundName);
			} else if (extension.equals(".ogg")) {
				ogg.add(soundName);
			}
			soundNames.add(soundName);
		}

		for (String soundName : soundNames) {
			if (!mp3.contains(soundName)) {
				System.out.println("Missing " + soundName + ".mp3");
			}
			if (!wav.contains(soundName)) {
				System.out.println("Missing " + soundName + ".wav");
			}
			if (!ogg.contains(soundName)) {
				System.out.println("Missing " + soundName + ".ogg");
			}
			final Sound sound = GamePackage.eINSTANCE.getGameFactory()
					.createSound();
			sound.setName(soundName);
			res.add(sound);
		}

		return res;
	}

}
