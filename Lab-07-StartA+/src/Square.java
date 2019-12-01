import java.awt.Color;



import java.awt.Graphics;

public class Square {
	private int x;
	private int y;
	private int diam;
	private Color color;
	private int xVel;
	private boolean xIsPos;
	private int yVel;
	private boolean yIsPos;
	
	public Square(int x, int y) {
		this.x = x;
		this.y = y;
		this.diam = 40;
		this.xVel = 7;
		this.xIsPos = true;
		
		this.yVel = 2;
		this.yIsPos = true;
		color = Color.blue;

	}
	public void changeColorRandom() {
		//Math.random();
		int red = (int)(256*Math.random());
		int green = (int)(256*Math.random());
		int blue = (int)(256*Math.random());
		int alpha = 255;
		Color c = new Color(red, green, blue,alpha);
		this.color = c;
	}

	public void paint(Graphics page) {
		page.setColor(color);
		page.fillRect(x, y, diam, diam);
	}
	
	public void randomXVel(int min, int max) {
		xVel = (int)((max-min)*Math.random()) + min;
	}

	public void randomYVel(int min, int max) {
		yVel = (int)((max-min)*Math.random()) + min;
	}
	
	public void moveX() {
		if(x>= 800-diam) {
			xIsPos = false;
			changeColorRandom();
			randomXVel(1,5);
		} 
		if (x<0) {
			xIsPos = true;
			changeColorRandom();
			randomXVel(1,5);
		}
		if (!xIsPos) {
			x-=xVel;
		} else {
			x+=xVel;	
		}
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
	public void moveY() {
		if(y>= 600-diam) {
			yIsPos = false;
			changeColorRandom();
			randomYVel(1,5);
		} 
		if (y<0) {
			yIsPos = true;
			changeColorRandom();
			randomYVel(1,5);
		}
		if (!yIsPos) {
			y-=yVel;
		} else {
			y+=yVel;	
		}
	}
	
	public int getDiam() {
		return diam;
	}
	public void setDiam(int diam) {
		this.diam = diam;
	}
	public void setXIsPos(boolean set) {
		xIsPos = set;
	}
	public void setYIsPos(boolean set) {
		yIsPos = set;
	}
	
	public boolean getXIsPos() {
		return xIsPos;
	}
	public boolean getYIsPos() {
		return yIsPos;
	}
}
