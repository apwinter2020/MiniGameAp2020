package mvvm;

import java.awt.Graphics;
import java.util.List;

/** 
 * Practically does all the drawing!
*/
public class ViewModel {

    /* lazy instantiation of the singleton ViewModel */
    private static class InstanceHolder {
        public static final ViewModel instance = new ViewModel();
    }

    public static ViewModel getInstance() {
        return InstanceHolder.instance;
    }

	public void draw(Graphics g , List<Data> data) {
		for(Data d : data) {
			drawGraphics(g , d);
		}
	}
	
	private void drawGraphics(Graphics g , Data data) { 
        switch (data.getType()) {
            case OVAL:
                drawOval(g, data);
                break;

            default: break;
        }
        /* other alternative, preventing view model from using possible logic: 
        * EnumMap<DrawType, BiConsumer<Graphics, Data> 
        */ 		
    }
    
    private void drawOval (Graphics g, Data data) { 
        g.drawOval(data.getX(), data.getY(), data.getWidth(), data.getHeight());
    }
}
