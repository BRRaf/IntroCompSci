import java.awt.Color;
import java.awt.Graphics;


public class Square {
	private int x;
	private int y;
	private int side;
	private Color color;
	
	
	
	public Square(int x, int y, int side, Color color){
		this.x = x;
		this.y = y;
	
		this.side = side;
		this.color = color;
		
		
	}
	

	
		
	//Draws the square for you
	public void paint(Graphics page){
		page.setColor(color);
		page.fillRect(x, y, this.side, this.side);
	}
	
	public void setPosition(int deltaX, int deltaY){
		x=deltaX;
		y=deltaY;
	}	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
	
	
	
}
