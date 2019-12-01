import java.awt.Color;
public class Rectangle extends Polygon {
	
		private int sx;
		private int sy;
		
		private int length;
		private int width;
		
		private Color color;
	
	public Rectangle(int sx, int sy, int length, int width, Color color ) {
		super(color, 4);
		
		this.sx = sx;
		this.sy = sy;
		
		this.length = length;
		this.width = width;
		
		
	}
	
	
	public void Draw() {
		setCorners(0,sx,sy);
		setCorners(1, sx + length, sy);
		setCorners(2, sx, sy + width);
		setCorners(3, sx + length, sy + width);
	}
	
	
	
}
