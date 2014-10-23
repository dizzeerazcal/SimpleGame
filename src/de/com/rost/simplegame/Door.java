package de.com.rost.simplegame;

public class Door extends GameObject {
	
	int id;
	boolean isOpen;

	@Override
	public boolean useOn(GameObject object) {
		return false;
	}

}
