package de.com.rost.simplegame;

public class Game {

	public static void main(String[] args) {

		Player marc = new Player("Marc");
		Player peter = new Player("Peter");
//		Magazine lifestyle = new Magazine("Lifestyle", 4.50);
//		Magazine ct = new Magazine("c't", 7.90);
		Room dungeon = new Room("Dungeon");
		dungeon.placePlayer(marc, peter);
		dungeon.listPlayers();
		
	}

}