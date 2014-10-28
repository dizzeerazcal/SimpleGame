package de.com.rost.simplegame;

import java.awt.Point;

import de.com.rost.simplegame.interfaces.Placeable;

public class Door extends GameObject implements Placeable {

	int id;
	boolean isOpen;
	Point position;
	char symbol;

	{
		isOpen = false;
	}

	public Door(String name) {
		super(name);
		symbol = '#';
	}
	
	@Override
	public boolean useOn(GameObject object) {
		return false;
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public void setPosition(Point position) {
		this.position = position;

	}

}
