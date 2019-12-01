import java.awt.Graphics;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
public class Turkey {
	
	private BufferedImage turkey;
	private int x;
	private int y;
	private int corner;
	private int endx;
	private int endy;
	private int movex;
	private int movey;
	private final int move;
	private int movearound;
	
	public int getEndx() {
		return endx;
	}

	public void setEndx(int endx) {
		this.endx = endx;
	}

	public int getEndy() {
		return endy;
	}

	public void setEndy(int endy) {
		this.endy = endy;
	}

	public Turkey(int x, int y, int corner) {
		try {
			turkey = ImageIO.read(new File("Turkey.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.x = x;
		this.y = y;
		this.corner = corner;
		move = 25;
		movearound = 0;
		
		

	} 
	
	public BufferedImage getTurkey() {
		return turkey;
	}

	public void setTurkey(BufferedImage turkey) {
		this.turkey = turkey;
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

	public void paint( Graphics page) {
		page.drawImage(turkey, x, y, null);
	}

	public void animate() {
		
		if (corner == 0) {
			
			if (x != endx) {
				x += 1;
			}
			if (y != endy) {
				y += 1;
			}
		}
			
		if (corner == 1) {
			
			if (x != endx) {
				x -= 1;
			}
			if (y != endy) {
				y += 1;
			}
		}
		
		if (corner == 2) {
			
			if (x != endx) {
				x -= 1;
			}
			if (y != endy) {
				y -= 1;
			}
		}
		
		if (corner == 3) {
			
			if (x != endx) {
				x += 1;
			}
			if (y != endy) {
				y -= 1;
			}
		}
		
		if (x == endx && y == endy) {
			corner = 4;
			movex = x - 50;
			movey = y - 50;
			corner = 5;
			
		}
		
		if (corner == 5) {
			if (y != movey ) {
				y -= 1;
		}
			if (y == movey) {
				corner = 6;
				movey += 50;
				
			}

		
		}
		
		if (corner == 6) {
			if (x != movex ) {
				x -= 1;
		}
			if (x == movex) {
				corner = 7;
				movex += 50;
			}
			
		}
		
		if (corner == 7) {
			if (y != movey ) {
				y += 1;
		}
			if (y == movey) {
				corner = 8;
				movey -= 50;
			}
		}
		

		if (corner == 8) {
			if (x != movex ) {
				x += 1;
		}
			if (x == movex) {
				corner = 5;
				movex -= 50;
			}
		}
	}
}
