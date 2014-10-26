package de.com.rost.simplegame.utility;

public class MyMathUtils {
	
	public static int randInt(int min, int d){
		return ( (int) (Math.random() * d + 1 - min ) + min );
	}

}
