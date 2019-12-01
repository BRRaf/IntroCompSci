import java.awt.Color;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.util.Random;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class SquarePanel extends JPanel implements MouseListener{
	
	private SquareStarter MyButtonPanel;
	private int numberOfSquares;
	private int xOffset;
	private int xIsPos;
	
	private int ypos;
	private int xpos;
	Color ogcolor;
	
	
	
	
	
	private Square[] mySquares;
	
	

	public SquarePanel(int numberofSquares) {
		
		
		super();
		
		ypos = 0;
		xpos = 0;
		this.mySquares = new Square[numberofSquares];
		
		
		final int side = 50;
		
		addMouseListener(this);
		for(int i = 0; i<mySquares.length;i++) {
			int flipper = (xpos+ypos)/side;
			mySquares[i] = new Square(xpos,ypos, side, ChooseColor(flipper));
			mySquares[i].setOgColor(ChooseColor(flipper));
			xpos += side;
		if (i != 0) {	
			if (i%10 == 0) {
				this.ypos += side;
				this.xpos = 0;
			}
		}
		}
	}
	
	public Color ChooseColor(int i) {
		Color c = Color.black;
		if (i % 2 == 0) {
			 c = Color.blue;
			 ogcolor = c;
			return c;
			
		} else  {
			 c = Color.red;
			 ogcolor = c;
			return c;
		}
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		for(int i = 0; i<mySquares.length; i++) {
			mySquares[i].paint(page);
		}
	}
	
	
	
	private int getnumberOfSquares() {
		return numberOfSquares;
	}
	
	
	
	
	
	
	
	public void mouseClicked(MouseEvent arg0) {
		
		int x = (int) (arg0.getX()/50 + 1) ;
		int y = (int) (arg0.getY()/50) * 10;
		
		int check = (int) x + y ;
		
		Square temp = mySquares[(x + y)];
		
		if (check < 10) {
			 temp = mySquares[check - 1];
			
		} else {
			 temp = mySquares[check];
		}
		
	if ((arg0.getX() >= temp.getX() && arg0.getX() <= (temp.getX() + 50))  && (arg0.getY() >= temp.getY() && arg0.getY() <= (temp.getY() + 50))) {
		
		if (temp.getVisible() == false){
			temp.setVisible(true);
			temp.setColor(temp.getOgColor());
		}
	}
		this.repaint();
		
		
		
		
	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Square[] getmySquare(){
		return mySquares;
	}
	
	public void setmySquare(Square[] s) {
		mySquares = s;
		this.repaint();
	}
	
	
	public void buttonPressed(Square temp, int i) {
		 mySquares[i] = temp;
		temp.setColor(ogcolor);
		this.repaint();
	
	}
	
	public Square pullRandomSquare(int i) {
		Square temp = mySquares[i];
		return temp;
	}
	
	
	
}
