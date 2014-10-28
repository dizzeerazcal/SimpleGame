package de.com.rost.simplegame.utility;

import de.com.rost.simplegame.Room;
import de.com.rost.simplegame.interfaces.Placeable;

public class RoomUtils {
	
	public static boolean coordinateCollisions(Room room, Placeable object) {

		if (!room.getGameObjects().isEmpty()) {
			for (Placeable gameObject : room.getGameObjects()) {
				if (object.getPosition().equals(gameObject.getPosition())){					
					System.err.printf("Collision");
					return true;		
					
				}					
			}
		}
		return false;

	}
}
