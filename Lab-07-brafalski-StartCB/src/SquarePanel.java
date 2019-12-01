import java.awt.Color;




import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Random;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class SquarePanel extends JPanel implements ActionListener {


	private int numberOfSquares;
	private int xOffset;
	private int xIsPos;

	private int ypos;
	private int xpos;






	private Square[] mySquares;
	private Piece cpupiece1;
	private Piece cpupiece2;
	private Piece cpupiece3;

	private Piece playerpiece;


	Timer t;

	public SquarePanel(int numberofSquares) {


		super();

		ypos = 0;
		xpos = 0;
		this.mySquares = new Square[numberofSquares];

		cpupiece1 = new Piece(450,0, 50, Color.white);
		cpupiece2 = new Piece(450,450, 50, Color.white);
		cpupiece3 = new Piece(0,450, 50, Color.white);

		playerpiece = new Piece(0,0,50, Color.green);
		final int side = 50;


		for(int i = 0; i<mySquares.length;i++) {
			int flipper = (xpos+ypos)/side;
			mySquares[i] = new Square(xpos,ypos, side, ChooseColor(flipper));
			xpos += side;
			if (i != 0) {	
				if (i%10 == 0) {
					this.ypos += side;
					this.xpos = 0;
				}
			}
		}
	}

	public Piece getPlayerpiece() {
		return playerpiece;
	}

	public void setPlayerpiece(Piece playerpiece) {
		this.playerpiece = playerpiece;
	}

	public Piece getCpupiece1() {
		return cpupiece1;
	}

	public void setCpupiece1(Piece cpupiece1) {
		this.cpupiece1 = cpupiece1;
	}

	public Piece getCpupiece2() {
		return cpupiece2;
	}

	public void setCpupiece2(Piece cpupiece2) {
		this.cpupiece2 = cpupiece2;
	}

	public Piece getCpupiece3() {
		return cpupiece3;
	}

	public void setCpupiece3(Piece cpupiece3) {
		this.cpupiece3 = cpupiece3;
	}

	public Color ChooseColor(int i) {
		Color c = Color.black;
		if (i % 2 == 0) {
			c = Color.blue;
			return c;

		} else  {
			c = Color.red;
			return c;
		}
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);

		for(int i = 0; i<mySquares.length; i++) {
			mySquares[i].paint(page);


		}
		cpupiece1.draw(page);
		cpupiece2.draw(page);
		cpupiece3.draw(page);
		playerpiece.draw(page);
	}





	public Square[] getmySquare(){
		return mySquares;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cpupiece1.animate();
		cpupiece2.animate();
		cpupiece3.animate();
		playerpiece.animate();
		this.repaint();
		
		
	}

	public void MoveRight( Piece piece) {
		if (piece.getX() < 450) {
				piece.setTargetX(piece.getX()+50); 
		

			
			
		}
	}

	public void MoveLeft( Piece piece) {	
		if (piece.getX() > 0) {
			
				piece.setTargetX(piece.getX()-50);
		}
	}	

	public void MoveUp( Piece piece)  {

		if (piece.getY() > 0) {
			
				piece.setTargetY(piece.getY()-50);
	
		}
	}

	public void MoveDown( Piece piece) {
		if (piece.getY() < 450) {
				
				piece.setTargetY(piece.getY()+50);
				
			
		}
	}

	public int EndCheck() {
		
		if (((playerpiece.getX() == cpupiece1.getX()) && (playerpiece.getY() == cpupiece1.getY()))){
			int end = 1;
			return end;
		}else if (((playerpiece.getX() == cpupiece2.getX()) && (playerpiece.getY() == cpupiece2.getY()))){
			int end = 1;
			return end;
		}
		else if (((playerpiece.getX() == cpupiece3.getX()) && (playerpiece.getY() == cpupiece3.getY()))){
			int end = 1;
			return end;
		}
		
		return 0;
		
	}
	


}
