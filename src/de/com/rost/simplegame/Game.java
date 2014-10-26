package de.com.rost.simplegame;

public class Game {

	public static void main(String[] args) {

		Player marc = new Player("Marc");
		Player peter = new Player("Peter");
		Magazine lifestyle = new Magazine("Lifestyle", 4.50);
		Magazine ct = new Magazine("c't", 7.90);
		Room dungeon = new Room("Dungeon",20);
		dungeon.placePlayer(marc, peter);

		marc.leftPocket.set((GameObject) lifestyle);
		marc.rightPocket.set((GameObject) ct);

		Grid grid = new Grid(dungeon);
		grid.drawGrid();
		
		dungeon.listPlayers();
		
	}

}