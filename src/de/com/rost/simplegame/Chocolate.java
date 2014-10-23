package de.com.rost.simplegame;

import de.com.rost.simplegame.interfaces.Buyable;

public class Chocolate extends GameObject implements Buyable{

	int price;
	
	@Override
	public boolean useOn(GameObject object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
