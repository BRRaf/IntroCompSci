import java.awt.Color;
import java.awt.Graphics;


public class Square {
	private int x;
	private int y;
	private int side;
	private Color color;
	
	public Square(int x, int y, int side, Color c){
		this.x = x;
		this.y = y;
		this.color = c;
		this.side = side;
	}
	
	//Draws the square for you
	public void draw(Graphics page){
		page.setColor(this.color);
		page.fillRect(this.x, this.y, this.side, this.side);
	}
	
	
	//Allwos us to move the square
	public void moveBy(int deltaX,int deltaY){
		x+=deltaX;
		y+=deltaY;
	}
}
