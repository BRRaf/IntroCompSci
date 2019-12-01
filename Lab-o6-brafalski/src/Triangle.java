import java.awt.Color;
public class Triangle extends Polygon {

	private int x;
	private int y;
	private Color color;
	private int baseheight;
	private int baselength;
	
	
	
	public Triangle(int x, int y, int h, int l, Color color) {
		super(color, 3);
		this.x = x;
		this.y = y;
		this.baseheight = h;
		this.baselength = l;
		
		
		
	}
	
		public void Draw() {
			setCorners(0,x,y);
			setCorners(1, x + baselength, y + baseheight);
			setCorners(2, x, y + baselength);
	
		}
}
