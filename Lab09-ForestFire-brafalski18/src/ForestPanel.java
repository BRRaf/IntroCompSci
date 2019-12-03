import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JPanel;

/*
* This program creates a panel that is filled with square objects, setting their color and state.
* This program can also change a square state based on color and mouse press location
*
*
*/ 

public class ForestPanel extends JPanel implements ActionListener, MouseListener {

	
	
	private int numberofTrees;
	private int xpos;
	private int ypos;
	private int treeprobability;
	private Random r;
	private int treenum;
	private Tree[] myTrees;
	private Tree normtree;
	private Timer t;
	
	
	public ForestPanel() {
		super();
		
		this.xpos=0;
		this.ypos=0;
		// where to change the probability, higher means more trees.
		this.treeprobability = 45;
		this.r = new Random();
		this.numberofTrees = 786432;
		 t = new Timer(75, this);
		normtree = new Tree(0,0,Color.BLACK);
		
		this.myTrees = new Tree[numberofTrees];
		addMouseListener(this);
	// Borrows from the Disappearing Squares Lab
		for(int i = 0; i< numberofTrees; i++) {
			
			myTrees[i] = new Tree(xpos, ypos, setColor(i));
			xpos += normtree.getSide();
			
			if (i != 0) {
				if (i%256 == 0) {
					this.ypos += normtree.getSide();
					this.xpos = 0;
				}
			}
			
		}
	}
	
	// When the treeprobability variable is higher it gives a greater chance for a tree to appear
	public Color setColor(int i) {
		
		Color color = Color.black;
		int setrandom = r.nextInt(100) + 1;
		
		
		if ( setrandom >= treeprobability) {
			color = Color.gray;
		} else if (setrandom < treeprobability) {
			color = Color.green;
		}
		
		return color;
		
	
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		for(int i = 0; i < myTrees.length; i++) {
			myTrees[i].paint(page);
		}
	}
	
	
	
	
	// The three rounds which changes the colors of the squares
		// Round 1 sets the first color and moves to round 2.
	public void Firestate1(int i) {
		myTrees[i].setColor(Color.red);
		myTrees[i].setState(2);
	}
	
	// Round 2 checks all the squares around the set square and changes them all to round 1
	public void Firestate2(int i) {
 if (myTrees[i -1].getX() != 1020) {
	 if (myTrees[i + 1].getX() != 0) {
	// up above;
	if (i - 256 >= 0) {	
		if (myTrees[i - 256].getColor() == Color.green ) {
			
			myTrees[i - 256].setState(1);
		}
	}
	//below
		if (myTrees[i + 256].getColor() == Color.green) {
			myTrees[i + 256].setState(1);
		}
		
		//left	
	
	
		if (myTrees[i - 1].getColor() == Color.green) {
			myTrees[i - 1].setState(1);
		}
		

		//right
	
		if (myTrees[i + 1].getColor() == Color.green) {
			myTrees[i + 1].setState(1);
		}

		// bottom right
	
		if (myTrees[i + 257].getColor() == Color.green) {
			myTrees[i + 257].setState(1);
		}
	
		// up left
		
		
		if (myTrees[i + 255].getColor() == Color.green) {
			myTrees[i + 255].setState(1);
		}
		
		// up right
		if (i - 257 >= 0) {	
		if (myTrees[i - 257].getColor() == Color.green) {
			myTrees[i - 257].setState(1);
		}
		}
		
		// bottom left
		if (i - 256 >= 0) {
		
		if (myTrees[i - 255].getColor() == Color.green) {
			myTrees[i - 255].setState(1);
		}
		}
 }
 }
 		myTrees[i].setColor(Color.orange);
		myTrees[i].setState(3);
 	
	}
	
	
	// makes the set square to gray and changes the state to a non usable state.
	public void Firestate3(int i) {
		myTrees[i].setColor(Color.gray);
		myTrees[i].setState(4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Timer/Mouse:
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < myTrees.length; i ++) {
			if (myTrees[i].getState() == 1) {
				Firestate1(i);
			} else if (myTrees[i].getState() == 2) {
				Firestate2(i);
			}  else if (myTrees[i].getState() == 3) {
				Firestate3(i);
		}
		
		repaint();
	}

	
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		;
		int x = (int) (e.getX()/normtree.getSide() + 1);
		int y = (int) (e.getY()/normtree.getSide() * 256);
		
		int check = (int) x + y;
		
		Tree temp = myTrees[check];
		
		if (check < 1024) {
			temp = myTrees[check - 1];
		}
		
	//	System.out.println("X: "+x+"/ Y: "+y+"/ Tree Number: "+check);
		if ((e.getX() >= temp.getX() && e.getX() <= (temp.getX() + normtree.getSide()))  && (e.getY() >= temp.getY() && e.getY() <= (e.getY() + normtree.getSide()))) {	
		if (temp.getColor() == Color.green) {
			treenum = check;
			temp.setState(1);
			
			t.start();
			
		}
		}
		
		
	}

	
	
	public int getSpecificTreeX(int i) {
		return myTrees[i].getX();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// not needed:
	
	
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
	
	
	
	
}
