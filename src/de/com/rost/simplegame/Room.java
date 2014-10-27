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
	ArrayList<Player> players = new ArrayList<>();

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

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void placePlayer(Placeable... players) {

		for (Placeable player : players) {

			Player p = (Player) player;
			p.useOn(this); // Put player inside room

			p.setPosition(new Point(MyMathUtils.randInt(0,
					((int) getDimension().getWidth() - 1)), MyMathUtils
					.randInt(0, ((int) getDimension().getHeight() - 1))));

			if (RoomUtils.coordinateCollisions(this, player)) {
				placePlayer(player);
			}

			else if (!RoomUtils.coordinateCollisions(this, player)
					|| this.players.isEmpty()) {
				this.players.add(p);

			}

		}
	}

	public void listPlayers() {

		StringBuilder message = new StringBuilder();
		for (Placeable e : players)
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
