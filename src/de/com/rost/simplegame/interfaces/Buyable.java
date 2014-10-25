package de.com.rost.simplegame.interfaces;

import de.com.rost.simplegame.utility.PriceUtils;

public interface Buyable extends Comparable<Buyable> {
	double MAX_PRICE = 50000.00;

	public double getPrice();

	@Override
	public default int compareTo(Buyable that) {
		return Double.compare(this.getPrice(), that.getPrice());
	};

	default boolean hasPrice() {
		// return getPrice() > 0;
		// Use of 'this'-reference is allowed because of dynamic binding
		return PriceUtils.hasPrice(this);
	}

}
