import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TwoButtonPanel extends JPanel {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	
	public TwoButtonPanel(ActionListener twocontroller) {
		super();
		
		button1 = null;
		button2 = null;
		button3 = null;
		
		button1 = new JButton();
		button1.setText("Button 1");
		add(button1);
		button1.addActionListener(twocontroller);
		
		
		button2 = new JButton();
		button2.setText("Button 2");
		add(button2);
		
		button2.addActionListener(twocontroller);
		
		button3 = new JButton();
		button3.setText("Button 3");
		add(button3);
		
		button3.addActionListener(twocontroller);
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
