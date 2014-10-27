package de.com.rost.simplegame;

import java.awt.Point;

import de.com.rost.simplegame.interfaces.Placeable;

public class Player extends GameObject implements Placeable {

	public Pocket<GameObject> leftPocket;
	public Pocket<GameObject> rightPocket;

	private Room room;

	{
		leftPocket = new Pocket<GameObject>();
		rightPocket = new Pocket<GameObject>();
	}

	public Player(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "[name=" + name + ",x:" + position.x
				+ "y:" + position.y + "]";
	}

	@Override
	public boolean useOn(GameObject object) {
		if (object.getClass().equals(Room.class)) {
			room = (Room) object;
			return true;
		} else
			return false;
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public void setPosition(Point position) {

		if (position.x <= room.getDimension().getWidth() & position.x >= 0
				& position.y <= room.getDimension().getHeight() & position.y >= 0)
			this.position.setLocation(position);
		
	
	}
}
