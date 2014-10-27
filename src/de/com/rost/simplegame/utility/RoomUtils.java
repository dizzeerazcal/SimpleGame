package de.com.rost.simplegame.utility;

import de.com.rost.simplegame.Player;
import de.com.rost.simplegame.Room;
import de.com.rost.simplegame.interfaces.Placeable;

public class RoomUtils {
	
	public static boolean coordinateCollisions(Room room, Placeable object) {

		if (!room.getPlayers().isEmpty()) {
			for (Player player : room.getPlayers()) {
				if (object.getPosition().equals(player.getPosition())){					
					System.err.printf("Collision");
					return true;		
					
				}					
			}
		}
		return false;

	}
}
