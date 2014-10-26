package de.com.rost.simplegame;

import java.awt.Point;
import java.util.ArrayList;

import de.com.rost.simplegame.interfaces.Placeable;
import de.com.rost.simplegame.utility.*;

public class Room extends GameObject {
	
	int size;
	ArrayList<Player> players = new ArrayList<>(); 

	public Room(String name, int size) {
		super(name);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public ArrayList<Player> getPlayers(){
		return players;
		
	}

	public void placePlayer(Placeable... players){
		for( Placeable player : players){
			
				player.setPosition(new Point(
						MyMathUtils.randInt(0,((int)Math.sqrt(this.size)-1)),
						MyMathUtils.randInt(0,((int)Math.sqrt(this.size)-1))));
				if(!RoomUtils.coordinateCollisions(this, player))
					this.players.add((Player)player);
//				System.out.println(RoomUtils.coordinateCollisions(this, player));
				
		}
	}
	
	public void listPlayers(){
		for( Placeable e : players )
			System.out.println(((GameObject) e).getName()
					+ "[x:" + e.getPosition().getX()
					+ " y:" + e.getPosition().getY() + "]");
		
	}
	
	@Override
	public boolean useOn(GameObject object) {
		return false;
	}
	
}
