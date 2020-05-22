package tv;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.EnumMap;
import javax.swing.JFrame;
import javax.swing.JPanel;

import enums.Channels;

/**
 * The main frame of the game, capable of switching "channels", 
 * which are actually different panels of the game
 * @see Channels
 */

public class View extends JFrame {

	private final EnumMap<Channels, JPanel> channels;

	public View() {
		channels = new EnumMap<>(Channels.class);
	}

	public void start() {
		setPreferredSize(
			new Dimension(1000,720) //implement: load from config
		);
		setSize(getPreferredSize());
		setVisible(true);
		
		new Thread(()->{
			while(true) {
				update();
			}
		}).start();
	}
	
	public void update() {
		repaint();
		revalidate();
		try {
			Thread.sleep(32); // 30 FPS
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void setChannel(Channels c) {
		setContentPane(channels.get(c));
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// this can be removed, it's only here for readability
	}

	private static final long serialVersionUID = 1L;
}
