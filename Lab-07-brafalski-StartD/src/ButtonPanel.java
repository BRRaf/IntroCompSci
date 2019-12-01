import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	
	public ButtonPanel(ActionListener controller) {
		super();
		
		button1 = null;
		button2 = null;
		button3 = null;
		
		button1 = new JButton();
		button1.setText("Button 1");
		add(button1);
		button1.addActionListener(controller);
		
		
		button2 = new JButton();
		button2.setText("Button 2");
		add(button2);
		
		button2.addActionListener(controller);
		
		button3 = new JButton();
		button3.setText("Button 3");
		add(button3);
		
		button3.addActionListener(controller);
	}
	
	
	
	

	
	
	
	
	
	
	public JButton getButton1() {
		return button1;
	}


	public JButton getButton2() {
		return button2;
	}


	public JButton getButton3() {
		return button3;
	}
	
}
