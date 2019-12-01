import java.awt.Color;
import java.awt.Graphics;

public class Circle {
		private int x;
		private int y;
		private int diameter;
		private Color color;
		
		public Circle(int x, int y, int diameter, Color c){
			this.x = x;
			this.y = y;
			this.color = c;
			this.diameter = diameter;
		}
		
		//Draws the square for you
		public void draw(Graphics page){
			page.setColor(this.color);
			page.fillOval(this.x, this.y, this.diameter, this.diameter);
		}
		
		
		//Allows us to move the oval
		public void moveBy(int deltaX,int deltaY){
			x+=deltaX;
			y+=deltaY;
		}
	}
	
	

