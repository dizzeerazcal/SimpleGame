package de.com.rost.simplegame.interfaces;

import de.com.rost.simplegame.utility.PriceUtils;

public interface Buyable {
	double MAX_PRICE = 50000.00;

	public double getPrice();

	default boolean hasPrice() {
//		return getPrice() > 0;
		// Use of 'this'-reference is allowed because of dynamic binding 
		return PriceUtils.hasPrice(this);
	}

}
