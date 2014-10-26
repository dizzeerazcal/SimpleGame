package de.com.rost.simplegame;

public class Grid {

	public static int MAX_WIDTH = 10;
	public static int MAX_HEIGHT = 10;

	int width;
	int height;
	Room room;

	public Grid(Room room) {
		this.room = room;
		if (Math.sqrt(room.getSize()) <= 10) {
			this.width = (int) Math.sqrt(room.getSize());
			this.height = (int) Math.sqrt(room.getSize());
		}
	}

	public void drawGrid() {
		//System.out.printf("w:%d h:%d%n", this.width, height);
		for (int height = 0; height < this.height; height++) {
			for (int width = 0; width < this.width; width++) {
				boolean isPlayer = false;
				for (Player player : room.getPlayers()){
					if (player.getPosition().getX() == width
							&& player.getPosition().getY() == height) {
						isPlayer = true;
					} 						
				}
				if(isPlayer)
					System.out.print("P ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}

}
