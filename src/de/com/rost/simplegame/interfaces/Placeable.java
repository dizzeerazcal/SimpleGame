package de.com.rost.simplegame.interfaces;

import java.awt.Point;

public interface Placeable {
	
	public static final Point PARKINGLOT = new Point(-1,-1);
	Point getPosition();

	void setPosition(Point position);

	default void remove() {
		setPosition(new Point(PARKINGLOT));
	}

}
