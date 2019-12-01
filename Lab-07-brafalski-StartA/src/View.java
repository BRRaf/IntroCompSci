import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View {
	JFrame frame;
	JPanel main;
	Panel panel;
	Timer t;
	Controller control;
	
	
	
	View(Controller c) {
		control = c;
		
		frame = new JFrame("A Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new Panel();
		panel.setPreferredSize(new Dimension(500,500));
		
		panel.addMouseListener(control);
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
		t = new Timer(10, panel);
		t.start();
	}
	
	public Panel getPanel() {
		return panel;
	}
}
