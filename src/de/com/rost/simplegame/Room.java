package de.com.rost.simplegame;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import de.com.rost.simplegame.interfaces.Placeable;
import de.com.rost.simplegame.utility.MyMathUtils;
import de.com.rost.simplegame.utility.RoomUtils;

public class Room extends GameObject {

	int size;
	Dimension dimension;
	ArrayList<Placeable> gameObjects = new ArrayList<>();

	{
		dimension = new Dimension(0, 0);
	}

	public Room(String name, int size) {
		super(name);
		this.size = size;
	}

	public Room(String name, int width, int height) {

		super(name);
		dimension = new Dimension(width, height);
	}

	public Dimension getDimension() {
		return dimension;
	}

	public ArrayList<Placeable> getGameObjects() {
		return gameObjects;
	}

	public void placeGameObject(Placeable... gameObjects) {

		for (Placeable o : gameObjects) {

			((GameObject)o).useOn(this); // Put player inside room

			o.setPosition(new Point(MyMathUtils.randInt(0,
					((int) getDimension().getWidth() - 1)), MyMathUtils
					.randInt(0, ((int) getDimension().getHeight() - 1))));

			if (RoomUtils.coordinateCollisions(this, o)) {
				placeGameObject(o);
			}

			else if (!RoomUtils.coordinateCollisions(this, o)
					|| this.gameObjects.isEmpty()) {
				this.gameObjects.add(o);

			}

		}
	}

	public void listGameObjects() {

		StringBuilder message = new StringBuilder();
		for (Placeable e : gameObjects)
			message.append((((GameObject) e).getName() + " [x:"
					+ e.getPosition().getX() + " y:" + e.getPosition().getY()
					+ "]" + System.lineSeparator()));
		javax.swing.JOptionPane.showMessageDialog(null, message);

	}

	@Override
	public boolean useOn(GameObject object) {
		return false;
	}

}
