import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.View;

public class StartD {
	
	Controller control;
	JFrame frame;
	JPanel main;
	NumPanel numPanel;
	ButtonPanel buttonPanel;
	
	
	public StartD(Controller c) {
		
		control = c;
		
		
		frame = new JFrame("StartD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 main = new JPanel();
		main.setPreferredSize(new Dimension(800,600));
		
		
		
		
		numPanel = new NumPanel();
		numPanel.setPreferredSize(new Dimension(200,100));

		
		
		buttonPanel = new ButtonPanel(control);
		buttonPanel.setPreferredSize(new Dimension(300,500));
		
		main.add(numPanel);
		main.add(buttonPanel);
		
		frame.getContentPane().add(main);
		
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	public void updateLabels(int l1, int l2, int l3) {
		numPanel.setallLabels(l1, l2, l3);
	}
			
	public ButtonPanel getButtonPanel() {
		return buttonPanel;
	}

	 public static void main(String[] args) {
		 
		Controller c = new Controller();
		TwoFramesController d = new TwoFramesController();
	 }
	



}
