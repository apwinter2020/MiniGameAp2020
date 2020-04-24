package tv;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

import enums.Channels;

public class View extends JFrame {

	
 private Channels type;
 
 private HashMap<Channels, JPanel> channel;
 
	
	public View() {
		
		
		
		
		
		new Thread(()->{
			while(true) {
				repaint();
				revalidate();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}
	
	public void setChannel(Enum c) {
		setContentPane(channel.get(c));
	}
	
	@Override
		public void paint(Graphics g) {
			super.paint(g);
			
	
	}
	

}
