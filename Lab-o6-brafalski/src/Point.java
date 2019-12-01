
public class Point {
	
	private int x;
	private int y;
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void move(int deltaX, int deltaY) {
		
		x += deltaX;
		y += deltaY;
		
	}
	
}
