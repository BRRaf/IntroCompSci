import java.awt.Color;

public class Polygon  {
	private Color color;
	private Point[] corners;
	
	public Polygon(Color color, int corners) {
		
		this.color = color;
		this.corners = new Point[corners];
		
	}
	
	public void setCorners(int h, int x, int y) {
		
			corners[h] = new Point(x,y);
		
	}
	
	public void move(int deltaX, int deltaY) {
		for (int i = 0; i < corners.length; i++) {
			corners[i].move(deltaX,deltaY);
		}
	}
	
	public String toString() {
		String rtn = "The color is "+color;
		for (int j = 0; j < corners.length; j++) {
			rtn += " Corner "+(j+1)+" = "+corners[j].getX()+", "+corners[j].getY();
		}
		return rtn;
	}
	
}
