package channels;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

import controller.Administrator;
import mvvm.Data;
import mvvm.ViewModel;

/** 
 * Wrapper of JPanel, sends data to view model for drawing 
 * @see ViewModel
*/
public class Panel extends JPanel {
    	
	private final transient ViewModel viewModel;
	
	public Panel() {
		this.viewModel = ViewModel.getInstance();
	}

	@Override
	public void paint(Graphics g) {
        super.paint(g);
        sendToViewModel(g);	
	}	

	private void sendToViewModel(Graphics g) {
        final List<Data> data = Administrator.getInstance().getData();
		viewModel.draw(g, data);
    }

    private static final long serialVersionUID = 1L;
}