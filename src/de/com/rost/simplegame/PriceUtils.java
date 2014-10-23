package de.com.rost.simplegame;

import de.com.rost.simplegame.interfaces.Buyable;

public class PriceUtils {	
//	 Private constructors do not allow 
//	 to instantiate objects of a class
	private PriceUtils(){}
//   Liskov substitution system !! N ever -argue- with the wrong type ;)
	public static boolean hasPrice(Buyable b){
		return b.getPrice() > 0;
	}

}
