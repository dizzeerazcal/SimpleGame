package de.com.rost.simplegame;

import de.com.rost.simplegame.interfaces.Buyable;

public class Magazine extends GameObject implements Buyable, Comparable<Magazine>{

	double price;

	public Magazine(String name, double price){
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean useOn(GameObject object) {
		return false;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Magazine that) {
		return Double.compare(this.getPrice(), that.getPrice());
	}

}
