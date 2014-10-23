package de.com.rost.simplegame;

public class Game {

	public static void main(String[] args) {

		Magazine mag1 = new Magazine("Mag 1", 0.98);
		Magazine mag2 = new Magazine("Mag 2", 10);
		System.out.println(mag1.compareTo(mag2));
	}

}