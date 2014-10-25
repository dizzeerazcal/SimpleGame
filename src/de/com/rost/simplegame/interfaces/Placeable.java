package de.com.rost.simplegame.interfaces;

import java.awt.Point;

public interface Placeable {

	Point getPosition();

	void setPosition(Point position);

	default void remove() {
		setPosition(new Point(-1,-1));
	}

}
