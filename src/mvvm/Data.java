package mvvm;

import java.awt.Color;
import java.awt.Image;
import enums.DrawType;
import channels.Panel;
import net.DataParser;

/** Raw data received from internet
     *  which are used directly in graphics api,
	 *  and indirectly by logic (after getting converted to game object)
	 * @see ViewModel
     * @see Panel
	 * @see DataParser
     */
public class Data {

	private int x;
	private int y;
	private Image image;
	private int width;
	private int height;
	private Color color;
	private DrawType type;

	public Data() {
		//do the initialization
	}

	public Data(String data) {
		//read the string
	}
	
	public Data setX(int x) {
		this.x = x;
		return this;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Data setY(int y) {
		this.y = y;
		return this;
	}

	public Image getImage() {
		return image;
	}

	public Data setImage(Image image) {
		this.image = image;
		return this;
	}

	public int getWidth() {
		return width;
	}

	public Data setWidth(int width) {
		this.width = width;
		return this;
	}

	public int getHeight() {
		return height;
	}

	public Data setHeight(int height) {
		this.height = height;
		return this;
	}

	public Color getColor() {
		return color;
	}

	public Data setColor(Color color) {
		this.color = color;
		return this;
	}

	public DrawType getType() {
		return type;
	}

	public Data setType(DrawType type) {
		this.type = type;
		return this;
	}
}


