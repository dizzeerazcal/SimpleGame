package de.com.rost.simplegame;


public class Player extends GameObject{
	
	public Player(String name){
		super(name);
		
	}

	@Override
	public boolean useOn(GameObject object) {
		return false;
	}
}
