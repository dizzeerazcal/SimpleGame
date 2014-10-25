package de.com.rost.simplegame;

public class Pocket {
	
	private Object value;
	public Pocket(){}
	
	public Pocket ( Object value){
		this.value = value;
	}
	
	public Object get(){
		return value;
	}

	public boolean isEmpty(){
		return value == null;
	}
	
	public void empty(){
		value = null;
	}
}
