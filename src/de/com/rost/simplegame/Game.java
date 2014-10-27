package de.com.rost.simplegame;

import javax.swing.JFrame;

public class Game {

	private static Room dungeon;
	
	public static void main(String[] args) {
		Player marc = new Player("Marc");
		Player peter = new Player("Peter");
		Player harald = new Player("Harald");
		dungeon = new Room("Dungeon", 40,10);
		dungeon.placePlayer(marc, peter, harald);
		Magazine lifestyle = new Magazine("Lifestyle", 4.50);
		Magazine ct = new Magazine("c't", 7.90);

		marc.leftPocket.set((GameObject) lifestyle);
		marc.rightPocket.set((GameObject) ct);
		
		showGUI();

	}
	
	private static void showGUI(){
		JFrame f = new JFrame(dungeon.getName());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GamePanel(dungeon));
		f.pack();
		f.setVisible(true);
	}

}