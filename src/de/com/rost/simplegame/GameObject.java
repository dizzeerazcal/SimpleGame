package de.com.rost.simplegame;

import java.awt.Point;

public abstract class GameObject {

	String name;
	Point position;
	char symbol;

	{
		name = "Unnamed Game Object";
		position = new Point();
		symbol = ' ';
	}
	
	public GameObject(){
		this.name = " ";
		symbol = this.name.charAt(0);
	}

	public GameObject(String name) {
		this.name = name;
		symbol = this.name.charAt(0);
	}

	public abstract boolean useOn(GameObject object);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
