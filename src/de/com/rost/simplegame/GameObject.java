package de.com.rost.simplegame;

import java.awt.Point;

public abstract class GameObject{

	String name;
	Point position;
	
	{
		name = "Unnamed Game Object";
		position = new Point();
	}

	public GameObject(){}
	
	public GameObject(String name){
		this.name = name;
	}
	
	public abstract boolean useOn(GameObject object);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
