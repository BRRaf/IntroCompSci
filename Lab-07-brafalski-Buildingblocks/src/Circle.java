import java.awt.Color;
import java.awt.Graphics;


public class Circle {
	private int x;
	private int y;
	private int side;
	private Color color;
	
	public Circle(int x, int y, int side, Color c){
		this.x = x;
		this.y = y;
		this.color = c;
		this.side = side;
	}
	
	//Draws the square for you
	public void draw(Graphics page){
		page.setColor(this.color);
		page.fillOval(this.x, this.y, this.side, this.side);
	}
	
	public void setPosition(int deltaX, int deltaY){
		x=deltaX;
		y=deltaY;
	}	
	
}
