package mvvm;

import java.awt.Graphics;

public class ViewModel {

    private static ViewModel instance = new ViewModel();

    public ViewModel() {
        //
    }

    public ViewModel getInstance() {
        return instance;
    }

	public void draw(Graphics g ,Data[] data ) {
		for(Data d : data) {
			drawGraphic(g , d);
		}
	}

	private static void drawGraphic(Graphics g , Data data) {
		switch (key) {
		case value:
			
			break;

		default:
			break;
		}
		
		
	}
	
	private void drawGraphic(Graphics g , Data data) { 
        
        switch (data.getType()) {
            case OVAL:
                drawOval(g, data);
                break;

            default:
                break;
            }		
    }
    
    private void drawOval (Graphics g, Data data) { 
        g.drawOval(data.getX(), data.getY(), data.getWidth(), data.getHeight());
    }
}
