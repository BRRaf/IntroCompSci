import java.awt.Color;
import java.awt.Graphics;


public class Square {
	private int x;
	private int y;
	private int targetX;
	private int targetY;
	private int side;
	private Color color;
	private Color ogcolor;
	
	private boolean visible;
	
	public Square(int x, int y, int side, Color color){
		this.x = x;
		this.y = y;
		this.targetX = x;
		this.targetY = y;
	
		this.side = side;
		this.color = color;
		
		this.visible = true;
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
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getTargetX() {
		return targetX;
	}
	
	public int getTargetY() {
		return targetY;
	}
	
	public void setTargetX(int x) {
		this.targetX = x;
	}
	
	public void setTargetY(int y) {
		this.targetY = y;
	}
	
	
	
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
	public void setVisible(boolean v) {
		visible = v;
	}
	
	public boolean getVisible() {
		return visible;
	}
	
	public void setOgColor(Color c) {
		ogcolor = c;
	}
	
	public Color getOgColor() {
		return ogcolor;
	}
	
	public void animate( int movey, int startx, int starty, int slopex, int slopey) {
		//System.out.println("current:" +x+" "+y+" Target: "+targetX+" "+targetY);
		if (x != (targetX ) && y != (targetY)) {
			
			
			if (slopex == 0) { 
				if (y < targetY) {
						y += 1;
					} else if (y > targetY) {
						y -= 1;
					}
			} else if (slopex != 0) {
			
			if (x < targetX) {
				x += 1;
				y = (slopey)/(slopex)*(x-startx)+starty;
			} else if (x > targetX) {
				x -= 1;
				y = (slopey)/(slopex)*(x-startx)+starty;
			} else if (x == targetX) {
				if (y < targetY) {
					y += 1;
				} else if (y > targetY) {
					y -= 1;
				}
			}
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			//if (x < targetX) {
			//	x += 1;
			//} else if (x > targetX) {
			//	x -= 1;
			//}if (y < targetY) {
			//	y += 1;
			//} else if (y > targetY) {
			//	y -= 1;
			//}


		
		
		}
		
		
	}
	
}
