import java.awt.Color;
import java.awt.Graphics;


public class Tree {
	private int x;
	private int y;
	private final int side;
	private Color color;
	private int state;
	
	
	public Tree(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.side = 4;
		this.state = 0;
	

		this.color = color;
	}

	
	// start of getters/setters:
	
	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}


	public int getSide() {
		return side;
	}
	
	
	// End of getters/setters
	

	
	
	public void paint(Graphics page) {
		page.setColor(color);
		page.fillRect(x, y, side, side);
	}
	
	
	
}

