import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class SquareStarter {
	SquarePanel squarePanel;
	SqButtonPanel buttonPanel;
	SquareController sqcontrol;
	JFrame frame;
	JPanel main;
	Timer t;
	
	public SquareStarter(SquareController c) {
		
		sqcontrol = c;
		frame = new JFrame("Square Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 main = new JPanel();
		main.setPreferredSize(new Dimension(800,500));
		
		
		
	 squarePanel = new SquarePanel(101);
		squarePanel.setPreferredSize(new Dimension(500,500));
		
		
		buttonPanel = new SqButtonPanel(sqcontrol);
		buttonPanel.setPreferredSize(new Dimension(200,100));
		
		
		
		
		main.add(squarePanel);
		main.add(buttonPanel);
		frame.getContentPane().add(main);
		
		frame.pack();
		frame.setVisible(true);
		
		
		t = new Timer(1000,sqcontrol);
		t.start();
		
		
		
		
	}
	
	public SqButtonPanel getButtonPanel() {
		return buttonPanel;
	}
	
	public SquarePanel getSqPanel() {
		return squarePanel;
	}
	
	public void setSqPanel(SquarePanel c) {
		squarePanel= c;
	}
	
	public static void main(String[] args)  {
		
		SquareController c = new SquareController();
	}
	
	
	
}
