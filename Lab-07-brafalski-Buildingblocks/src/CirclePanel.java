import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CirclePanel extends JPanel {
	/**
	 * 
	 */
	
	private Circle c;
	private Square s;
	
	public CirclePanel() {
		super();
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(600,600));
		c = new Circle(25,25, 25,Color.red);
		s = new Square(25,25,25,Color.red);
	}
	
	public void setCirclePosition(int x, int y){
		c.setPosition(x, y);
		repaint();
	}
	
	public void setSquarePosition(int x, int y) {
		s.setPosition(x, y);
		repaint();
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);		
		c.draw(page);
		s.draw(page);
	}
}