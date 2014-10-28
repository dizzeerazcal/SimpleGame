package de.com.rost.simplegame;

import javax.swing.JFrame;

public class Game {

	private static Room dungeon;
	
	public static void main(String[] args) {		
		setupNewGame();
		showGUI();
	}
	
	private static void setupNewGame(){
		Player player = new Player("Player");
		Gold gold = new Gold("$Treasure$", 100000);
		Door door = new Door("#Exit");
		dungeon = new Room("Dungeon", 40,10);
		
		dungeon.placeGameObject(player, gold, door);
		
		Magazine lifestyle = new Magazine("Lifestyle", 4.50);
		Magazine ct = new Magazine("c't", 7.90);
		player.leftPocket.set((GameObject) lifestyle);
		player.rightPocket.set((GameObject) ct);
	}
	
	private static void showGUI(){
		JFrame f = new JFrame(dungeon.getName());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GamePanel(dungeon));
		f.pack();
		f.setVisible(true);
	}
	
}