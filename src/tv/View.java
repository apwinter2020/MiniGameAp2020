package tv;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

import enums.Channels;

public class View extends JFrame {

	private final HashMap<Channels, JPanel> channel;
	private Channels current;

	public View() {
		//
	}

	public void start() {
		setPreferredSize(
			new Dimension(1000,1000)
		);
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
			Thread.sleep(16);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void setChannel(Channels c) {
		current = c;
		setContentPane(channel.get(c));
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	private static final long serialVersionUID = 1L;
}
