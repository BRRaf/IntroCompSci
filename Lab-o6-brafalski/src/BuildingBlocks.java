import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class BuildingBlocks {

	public static void main(String[] args) {
		
		
		
		
		//Question 31
		/* Using the code below and in the file BuildingBlocksPanel as a guide create a new frame
		 * and panel that draws three ovals with three different colors
		 */
		
		//JFrame frame = new JFrame("This is our Frame");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame2 = new JFrame("Question 1 Frame");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Code to add a panel!
		//JPanel mainPanel = new JPanel();
		//mainPanel.setPreferredSize(new Dimension(800,600));
		//BuildingBlocksPanel bbPanel = new BuildingBlocksPanel();
		//mainPanel.add(bbPanel);
		//frame.getContentPane().add(mainPanel);
		//frame.pack();
		
		
		JPanel mainPanel2 = new JPanel();
		mainPanel2.setPreferredSize(new Dimension(900,600));
		BuildingBlocksPanel pane2 = new BuildingBlocksPanel();
		mainPanel2.add(pane2);
		frame2.getContentPane().add(mainPanel2);
		frame2.pack();
		
		frame2.setVisible(true);
		
		
		
		//frame.setVisible(true);
		
		//Question 2
		/* Using the code below and in the file BuildingBlocksTimerPanel and square as a guide create a new frame
		 * and a panel that draws an oval that moves gradually to the right
		 */
		
		//JFrame frameTimer = new JFrame("This is our Frame");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame frameTimer2 = new JFrame("Timer Frame");
		frameTimer2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Code to add a panel!
		//JPanel mainPanelTimer = new JPanel();
		//mainPanel.setPreferredSize(new Dimension(800,600));
		//BuildingBlocksTimerPanel bbTimerPanel = new BuildingBlocksTimerPanel();
		//mainPanelTimer.add(bbTimerPanel);
		//frameTimer.getContentPane().add(mainPanelTimer);
		//frameTimer.pack();

		JPanel mainPanelTimer2 = new JPanel();
		mainPanelTimer2.setPreferredSize(new Dimension(800,600));
		BuildingBlocksTimerPanel TimerPane2 = new BuildingBlocksTimerPanel();
		mainPanelTimer2.add(TimerPane2);
		frameTimer2.add(TimerPane2);
		frameTimer2.getContentPane().add(mainPanelTimer2);
		frameTimer2.pack();
		
		frameTimer2.setVisible(true);
		
		//frameTimer.setVisible(true);
		
		Timer timer = new Timer(20, TimerPane2);
		timer.start();
		//Timer timer = new Timer(20, bbTimerPanel);
		//timer.start();
		
		

	}

}
