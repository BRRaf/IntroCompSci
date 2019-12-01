import java.awt.Color;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Starter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("This is our Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(800,600));
		mainPanel.setBackground(Color.white);
		
		AwesomePanel redPanel = new AwesomePanel(2);
		redPanel.setPreferredSize(new Dimension(800,600));
		
		
		mainPanel.add(redPanel);
//		
//		JPanel bluePanel = new JPanel();
//		bluePanel.setPreferredSize(new Dimension(100,100));
//		bluePanel.setBackground(Color.blue);
//		
//		mainPanel.add(bluePanel);
		
		frame.getContentPane().add(mainPanel);
		
		
		
		frame.pack();
		frame.setVisible(true);
		
		Timer t = new Timer(10,redPanel);
		t.start();
	}

}
