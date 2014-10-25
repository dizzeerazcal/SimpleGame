package de.com.rost.simplegame;


public class Player extends GameObject{
	
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
}
