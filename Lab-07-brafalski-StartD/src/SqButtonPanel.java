import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
public class SqButtonPanel extends JPanel {
	
	private JButton regbutton;
	
	private SquarePanel sq;
	
	
	public SqButtonPanel(ActionListener e) {
		super();
		
		regbutton = new JButton();
		regbutton.setText("Regenerate Square");
		add(regbutton);
		regbutton.addActionListener(e);
		

		
		
		
	}

	public JButton getRegbutton() {
		return regbutton;
	}

	public void setRegbutton(JButton regbutton) {
		this.regbutton = regbutton;
	}

	
	
		
		
		
		
		
		
	
	
	
}
