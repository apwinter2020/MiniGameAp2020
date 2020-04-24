package channels;

import java.awt.Graphics;

import javax.swing.JPanel;

public class game extends JPanel {
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		viewModel.draw(g , administer.getDataShape());
		
	}
	
	
	
}
