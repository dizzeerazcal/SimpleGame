package de.com.rost.simplegame;

public abstract class GameObject{

	String name;
	
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
