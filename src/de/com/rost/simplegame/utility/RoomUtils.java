package de.com.rost.simplegame.utility;

import java.util.Arrays;

import de.com.rost.simplegame.Room;
import de.com.rost.simplegame.Snake;
import de.com.rost.simplegame.interfaces.Placeable;

public class RoomUtils {

	public static boolean coordinateCollisions(Room room, Placeable object) {

		if (!room.getGameObjects().isEmpty()) {
			for (Placeable gameObject : room.getGameObjects()) {
				if (!(gameObject instanceof Snake)) {
					if (gameObject.getPosition().equals(object.getPosition())) {
						System.out.println("Collision");
						return true;
					}
				} else {
					if (Arrays.asList(((Snake)gameObject).getPositions()).contains(object.getPosition())){
						System.out.println("Collision");
						return true;
					}
				}
			}
		}
		return false;
	}
}
