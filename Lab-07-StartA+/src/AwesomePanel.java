import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;


public class AwesomePanel extends JPanel implements ActionListener{
	private int numberOfCircles;
	private int xOffset;
	private int xVel;
	private boolean xIsPos;
	
	private Square[] myCircles;
	
	public AwesomePanel(int numberOfCircles){
		super();
		
		myCircles = new Square[numberOfCircles];
		final int diameter = 40;
		for(int i =0;i<numberOfCircles;i++) {
			myCircles[i] = new Square(i*diameter, i*diameter);
		}
		
		setBackground(Color.black);
		xOffset = 0;
		xVel = 5;
		xIsPos = true;
		
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		for(int i =0;i<myCircles.length;i++) {
			myCircles[i].paint(page);
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i =0;i<myCircles.length;i++) {
			myCircles[i].moveX();
			myCircles[i].moveY();
			collide();
		}
		this.repaint();
		
	}
	
	public void collide() {
		// colliding left
		if ((myCircles[0].getY() >= myCircles[1].getY()) && (myCircles[0].getY() <= myCircles[1].getY() +myCircles[1].getDiam()) && (myCircles[0].getX() + myCircles[0].getDiam() == myCircles[1].getX())){
			
			System.out.println("square 1 hit square 2 from the left");
			if (myCircles[0].getXIsPos() == false) {
				
				myCircles[0].setXIsPos(true);
				myCircles[1].setXIsPos(false);
			} else {
				
				myCircles[0].setXIsPos(false);
				myCircles[1].setXIsPos(true);
			}
			
			
			
		}
		
		// colliding right
		if ((myCircles[0].getY() >= myCircles[1].getY()) && (myCircles[0].getY() <= myCircles[1].getY() + myCircles[1].getDiam()) && (myCircles[0].getX() == myCircles[1].getX() + myCircles[1].getDiam())){
			System.out.println("square 1 hit square 2 from the right");
			
			if (myCircles[0].getXIsPos() == false) {
				myCircles[0].setXIsPos(true);
				myCircles[1].setXIsPos(false);
			} else {
				myCircles[0].setXIsPos(false);
				myCircles[1].setXIsPos(true);
			}
			
			
			
			
		}
		
		// colliding top
		if ((myCircles[0].getX() >= myCircles[1].getX()) && (myCircles[0].getX() <= myCircles[1].getX() + myCircles[1].getDiam()) && (myCircles[0].getY() + myCircles[0].getDiam() == myCircles[1].getY())){
			
			System.out.println("square 1 hit square 2 from the top");
			if (myCircles[0].getYIsPos() == false) {
				myCircles[0].setYIsPos(true);
				myCircles[1].setYIsPos(false);
			} else {
				myCircles[0].setYIsPos(false);
				myCircles[1].setYIsPos(true);
			}
			
		}
		
		// colliding bottom
		if ((myCircles[0].getX() >= myCircles[1].getX()) && (myCircles[0].getX() <= myCircles[1].getX() + myCircles[1].getDiam()) && (myCircles[0].getY() == myCircles[1].getY() + myCircles[1].getDiam())){
			System.out.println("square 1 hit square 2 from the bottom");
			if (myCircles[0].getYIsPos() == false) {
				myCircles[0].setYIsPos(true);
				myCircles[1].setYIsPos(false);
			} else {
				myCircles[0].setYIsPos(false);
				myCircles[1].setYIsPos(true);
			}
			
		}
	}

}