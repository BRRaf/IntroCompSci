import java.awt.Color;
public class Squarelab6 extends Polygon {

	private int x;
	private int y;
	private int side;
	private Color color;
	
	public Squarelab6(int x, int y, int side, Color color) {
		super(color, 4);
		
		this.x = x;
		this.y = y;
		this.side = side;
	}
	
	public void Draw() {
		setCorners(0,x,y);
		setCorners(1, x + side, y);
		setCorners(2, x + side, y + side);
		setCorners(3, x, y + side);
		
	}
}
