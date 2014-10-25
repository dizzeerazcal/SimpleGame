package de.com.rost.simplegame;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args) {

		Player marc = new Player("Marc");
		Player peter = new Player("Peter");
		Magazine lifestyle = new Magazine("Lifestyle", 4.50);
		Magazine ct = new Magazine("c't", 7.90);
		Room dungeon = new Room("Dungeon");
		dungeon.placePlayer(marc, peter);
		dungeon.listPlayers();

		marc.leftPocket.set((GameObject) lifestyle);
		marc.rightPocket.set((GameObject) ct);

		System.out.println(marc.leftPocket.get().getName());
		System.out.println(marc.rightPocket.get().getName());
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640, 480);
		
	}

}