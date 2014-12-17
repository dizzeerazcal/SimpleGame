package de.com.rost.simplegame.utility;

import java.awt.Point;

import de.com.rost.simplegame.Room;
import de.com.rost.simplegame.Snake;
import de.com.rost.simplegame.interfaces.Placeable;

public class RoomUtils {

	public static boolean coordinateCollisions(Room room, Placeable object) {

		if (!room.getGameObjects().isEmpty()) {
			for (Placeable gameObject : room.getGameObjects()) {
				if (!(object instanceof Snake)) {
					if (object.getPosition().equals(gameObject.getPosition())) {
						javax.swing.JOptionPane.showMessageDialog(null,
								"Collision");
						return true;
					}
				} else {
					for (Point ref : ((Snake) object).getPositions()) {
						System.out.println(ref);
//						if (ref.equals(object.getPosition())) {
//							javax.swing.JOptionPane.showMessageDialog(null,
//									"Collision");
//							return true;
//						}
					}
				}
			}
		}
		return false;
	}
}
