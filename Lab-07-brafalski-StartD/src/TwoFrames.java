import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class TwoFrames {
	
	
	TwoFramesController twocontrol;
	JFrame frame1;
	JFrame frame2;
	JPanel main;
	NumPanel numPanel;
	TwoButtonPanel buttonPanel;

	
	public TwoFrames(TwoFramesController c) {
		
		twocontrol = c;
		
		
		frame1 = new JFrame("Frame1");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		frame2 = new JFrame("Frame2");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		numPanel = new NumPanel();
		numPanel.setPreferredSize(new Dimension(200,100));

		frame1.add(numPanel);
		
		buttonPanel = new TwoButtonPanel(twocontrol);
		buttonPanel.setPreferredSize(new Dimension(300,500));
		
		frame2.add(buttonPanel);
		
		
		
		
		frame2.pack();
		frame2.setVisible(true);
		frame1.pack();
		frame1.setVisible(true);
		
	}
	
	public void updateLabels(int l1, int l2, int l3) {
		numPanel.setallLabels(l1, l2, l3);
	}
			
	public TwoButtonPanel getButtonPanel() {
		return buttonPanel;
	}
}
