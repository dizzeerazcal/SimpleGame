package de.com.rost.simplegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import de.com.rost.simplegame.interfaces.Placeable;

public class GamePanel extends JPanel implements KeyListener {

	private static final long serialVersionUID = -4735916011178386352L;
	private final Room ROOM;

	public GamePanel(Room room) {
		ROOM = room;
		setPreferredSize(new Dimension(
				(int) ROOM.getDimension().getWidth() * 10, (int) ROOM
						.getDimension().getHeight() * 10));
		setFocusable(true);
		addKeyListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
		g.setColor(Color.BLACK);

		for (int y = 0; y < ROOM.getDimension().getHeight(); y++) {
			for (int x = 0; x < ROOM.getDimension().getWidth(); x++) {
				char c = ' ';
				Point p = new Point(x, y);
				for (Placeable gameObject : ROOM.getGameObjects()) {
					if (p.equals(gameObject.getPosition())) {
						c = ((GameObject)gameObject).symbol;
					}
				}
				if (!Character.isWhitespace(c))
					g.drawString(Character.toString(c), x * 10, y * 10);
			}
		}

	};

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Placeable gameObject = ROOM.getGameObjects().get(0);
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			gameObject.setPosition(new Point(gameObject.getPosition().x,
					gameObject.getPosition().y - 1));
			break;
		case KeyEvent.VK_DOWN:
			gameObject.setPosition(new Point(gameObject.getPosition().x,
					gameObject.getPosition().y + 1));
			break;
		case KeyEvent.VK_LEFT:
			gameObject.setPosition(new Point(gameObject.getPosition().x - 1,
					gameObject.getPosition().y));
			break;
		case KeyEvent.VK_RIGHT:
			gameObject.setPosition(new Point(gameObject.getPosition().x + 1,
					gameObject.getPosition().y));
			break;
		case KeyEvent.VK_L:
			ROOM.listGameObjects();
			break;
		case KeyEvent.VK_ESCAPE:
			System.exit(0);
			break;
		case KeyEvent.VK_F1:
			javax.swing.JOptionPane.showMessageDialog(null,
					"Was für Hilfe du Lappen ???");
			break;
		default:
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		repaint();
	}

}
