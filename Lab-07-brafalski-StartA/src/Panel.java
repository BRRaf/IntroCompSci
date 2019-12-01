import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
public class Panel extends JPanel implements ActionListener {

	private int xpos;
	private int ypos;
	private Square square;
	
	private int startx;
	private int starty;
	private int slopeX;
	private int slopeY;
	private int movey;
	
	public Panel() {
		super();
		
		ypos = 0;
		xpos = 0;
		startx = 0;
		starty = 0;
		slopeX = 0;
		slopeY = 0;
		square = new Square(0,0,50,Color.red);
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		square.paint(page);
	}
	
	public void Move(int endx, int endy) {
		square.setTargetX(endx);
		square.setTargetY(endy);
		
		 startx = square.getX();
		 starty = square.getY();
		
		 slopeY = (endy - starty);
		 slopeX = (endx- startx);
		 
		  
		 
		 System.out.println("SlopeY: "+slopeY);
		 System.out.println("SlopeX:"+slopeX);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		square.animate(movey, startx, starty, slopeX, slopeY);
		this.repaint();
	}
	
	
}
