package de.com.rost.simplegame;

import java.util.ArrayList;

import de.com.rost.simplegame.interfaces.Placeable;

public class Room extends GameObject {
	int size;
	ArrayList<Placeable> players = new ArrayList<>(); 

	public Room(String name) {
		super(name);

	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void placePlayer(Placeable... players){
		for( Placeable player : players)
			this.players.add(player);
	}
	
	public void listPlayers(){
		for( Placeable e : players )
			System.out.println(((GameObject) e).getName());
			
	}
	
	@Override
	public boolean useOn(GameObject object) {
		return false;
	}
	
}
