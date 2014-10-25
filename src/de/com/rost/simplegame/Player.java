package de.com.rost.simplegame;

import java.awt.Point;

import de.com.rost.simplegame.interfaces.Placeable;


public class Player extends GameObject implements Placeable{
	
	public Player(String name){
		super(name);
		
	}
	
	@Override
	public String toString(){
		return this.getClass().getName() + "[name=" + name + "]";
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
		this.position.setLocation(position);
		
	}
}
