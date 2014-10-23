package de.com.rost.simplegame;

import java.util.ArrayList;

public class Room extends GameObject {
	int size;
	ArrayList<Player> players = new ArrayList<>(); 

	public Room(String name) {
		super(name);

	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void placePlayer(Player player){
		players.add(player);
	}
	
	public void listPlayers(){
		for( Player e : players )
			System.out.println(e.getName());
			
	}
	
	@Override
	public boolean useOn(GameObject object) {
		
		return false;
	}
	
}
