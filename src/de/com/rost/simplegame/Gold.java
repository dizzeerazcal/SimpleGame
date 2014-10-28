package de.com.rost.simplegame;

import java.awt.Point;

import de.com.rost.simplegame.interfaces.Buyable;
import de.com.rost.simplegame.interfaces.Placeable;

public class Gold extends GameObject implements Buyable, Placeable {

	private double price;
	char symbol;

	public Gold(String name, double price) {
		super(name);
		this.price = price; 
		symbol = '$';
	}

	@Override
	public int compareTo(Buyable that) {
		return (int)(this.getPrice() - that.getPrice());
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public boolean useOn(GameObject object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public void setPosition(Point position) {
		this.position = position;

	}

}
