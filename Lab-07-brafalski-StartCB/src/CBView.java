import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
public class CBView {
	
	CBController control;
	JFrame frame;
	JPanel main;
	SquarePanel sqpanel;
	ButtonPanel btpanel;
	Timer t1;
	Timer t2;
	Timer t3;
	JFrame endframe;
	JPanel endpanel;
	int endcheck = 0;
	JLabel label;
	
	public CBView(CBController c) {
		
		control = c;
		
		frame = new JFrame("CB Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		endframe = new JFrame("End");
		endframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		endpanel = new JPanel();
		endpanel.setPreferredSize(new Dimension(100, 100));
		label = new JLabel("YOU DIED!!!!!");
		endpanel.add(label);
		
		
		main = new JPanel();
		main.setPreferredSize(new Dimension(750,510));
		
		sqpanel = new SquarePanel(101);
		sqpanel.setPreferredSize(new Dimension(500,500));
		
		btpanel = new ButtonPanel(control);
		btpanel.setPreferredSize(new Dimension(200,505));
		
		
		main.add(sqpanel);
		main.add(btpanel);
		
		endframe.getContentPane().add(endpanel);
		
		frame.getContentPane().add(main);
		frame.pack();
		frame.setVisible(true);
		
		t1 = new Timer(1000, control);
		t1.start();
		
		Timer animate = new Timer(10, sqpanel);
		animate.start();
		
		t2 = new Timer(500, control);
		t2.start();
		
		t3 = new Timer(2000, control);
		t3.start();
		endframe.pack();
		endframe.setVisible(false);
	}
	
	public void End() {
		endframe.pack();
		endframe.setVisible(true);
		frame.setVisible(false);
		
	}
	
	public SquarePanel getSqPanel() {
		return sqpanel;
	}

	public ButtonPanel getButtons() {
		return btpanel;
	}
	
	public Timer getTimer1() {
		return t1;
	}
	
	public Timer getTimer2() {
		return t2;
	}
	
	public Timer getTimer3() {
		return t3;
	}
	
}
