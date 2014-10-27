package de.com.rost.simplegame.utility;

public class MyMathUtils {
	
	public static int randInt(int min, int max){
		return ( (int) (Math.random() * max + 1 - min ) + min );
	}

}
