import java.awt.Color;
import java.awt.Graphics;
public class Piece {

	private int x;
	private int y;
	private int targetX;
	private int targetY;
	private int diam;
	private Color color;
	
	public Piece(int x, int y, int diam, Color color) {
		
		this.x = x;
		this.y = y;
		this.targetX = x;
		this.targetY = y;
		this.diam = diam;
		this.color = color;
	}
	
	public void draw(Graphics page) {
		page.setColor(color);
		page.fillOval(x, y, diam, diam);
	}

	public int getX() {
		return x;
	}

	public void setTargetX(int x) {
		this.targetX = x;
	}

	public int getY() {
		return y;
	}

	public void setTargetY(int y) {
	
		this.targetY = y;
	}

	public int getDiam() {
		return diam;
	}

	public void setDiam(int diam) {
		this.diam = diam;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void animate() {
		if (x != targetX || y != targetY) {
			if (x > targetX) {
				x -= 5;   
			}
			if ( x < targetX) {
				x += 5;
			}
			if ( y > targetY) {
				y -= 5;
			}
			if ( y < targetY) {
				y += 5;
			}
		}
		
	}


	
}
