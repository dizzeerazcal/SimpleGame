package de.com.rost.simplegame;

import java.awt.Point;

public class Snake extends Player {
	
	int length;
	Point[] positions;
	int snakeIdx;
	Room room;
	
	public Snake(String name, int length){
		super(name);
		this.length = length;
		positions = new Point[length];
		snakeIdx = 0;
		positions[snakeIdx] = new Point(20,20);
	}
	
	public Point[] getPositions(){
		return positions;
	}

	@Override
	public void setPosition(Point position) {

		if (position.x <= room.getDimension().getWidth() & position.x >= 0
				& position.y <= room.getDimension().getHeight()
				& position.y >= 0)
			this.positions[snakeIdx] = position;
			this.position.setLocation(position);
			snakeIdx = (snakeIdx + 1) % positions.length;

	}
	
	@Override
	public boolean useOn(GameObject object) {
		if( object instanceof Room){
			room = (Room) object;
			return true;
		} else if ( object instanceof Player ){
			System.exit(0);
		}
		return false;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

}
