package fr.obeo.generator.game.service;

import java.util.ArrayList;
import java.util.List;

import fr.obeo.dsl.game.Game;
import fr.obeo.dsl.game.Sprite;

public class Services {

	/**
	 * Gets the collision mask name for the given {@link Sprite}.
	 * 
	 * @param sprite
	 *            the {@link Sprite}
	 * @return the collision mask name for the given {@link Sprite}
	 */
	public String getMaskName(Sprite sprite) {
		final String res;

		if (sprite.getParent() != null) {
			res = getMaskName(sprite.getParent());
		} else {
			res = sprite.getClassName();
		}

		return res;
	}

	/**
	 * Gets the collision mask for the given {@link Sprite}.
	 * 
	 * @param sprite
	 *            the {@link Sprite}
	 * @return the collision mask for the given {@link Sprite}
	 */
	public int getMask(Sprite sprite) {
		final int res;

		if (sprite.getParent() != null) {
			res = getMask(sprite.getParent());
		} else {
			final Game game = (Game) sprite.eContainer();
			int index = 0;
			for (Sprite sp : game.getSprites()) {
				if (sp.getParent() == null) {
					if (sp == sprite) {
						break;
					}
					++index;
				}
			}
			res = (int) Math.pow(2, index);
		}

		return res;
	}

	/**
	 * Gets {@link Sprite} in declare order ({@link Sprite#getParent() parent}
	 * before the {@link Sprite} it self).
	 * 
	 * @param game
	 *            the {@link Game}
	 * @return {@link Sprite} in declare order ({@link Sprite#getParent()
	 *         parent} before the {@link Sprite} it self)
	 */
	// FIXME something is buggus here
	public List<Sprite> getDeclareOrderedSprites(Game game) {
		final List<Sprite> res = new ArrayList<Sprite>();

		for (Sprite sprite : game.getSprites()) {
			if (sprite.getParent() != null) {
				if (!res.contains(sprite.getParent())) {
					addSprite(res, sprite.getParent());
				}
				res.add(sprite);
			} else {
				res.add(sprite);
			}
		}

		return res;
	}

	/**
	 * Add a {@link Sprite} to the given {@link List} after all its
	 * {@link Sprite#getParent() parents}.
	 * 
	 * @param sprites
	 *            the {@link List} of {@link Sprite} to populate
	 * @param sprite
	 *            the {@link Sprite}
	 */
	private void addSprite(List<Sprite> sprites, Sprite sprite) {
		if (!sprites.contains(sprite.getParent())) {
			addSprite(sprites, sprite.getParent());
		}
		sprites.add(sprite);
	}

}
