package de.com.rost.simplegame;

import javax.swing.JFrame;

public class Game {

	private static Room dungeon;
	
	public static void main(String[] args) {		
		setupNewGame();
		showGUI();
	}
	
	private static void setupNewGame(){
		Door door = new Door("#Exit");
		Gold gold = new Gold("$Treasure$", 100000);
		Player marc = new Player("Player");
		Player harald = new Player("Harald");
		Snake snake = new Snake("Snake", 5);
		dungeon = new Room("Dungeon", 40, 10);
		
		dungeon.placeGameObject(marc, snake, gold, door, harald);
		
		Magazine lifestyle = new Magazine("Lifestyle", 4.50);
		Magazine ct = new Magazine("c't", 7.90);
		marc.leftPocket.set((GameObject) lifestyle);
		marc.rightPocket.set((GameObject) ct);
	}
	
	private static void showGUI(){
		JFrame f = new JFrame(dungeon.getName());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GamePanel(dungeon));
		f.pack();
		f.setVisible(true);
	}
	
}