import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	
	private JButton moveup;
	private JButton movedown;
	private JButton moveright;
	private JButton moveleft;
	
	public ButtonPanel(ActionListener control)  {
		super();
		
		moveup = new JButton();
		moveup.setText("Move Up");
		add(moveup);
		moveup.addActionListener(control);
		
		movedown = new JButton();
		movedown.setText("Move Down");
		add(movedown);
		movedown.addActionListener(control);
		
		moveright = new JButton();
		moveright.setText("Move Right");
		add(moveright);
		moveright.addActionListener(control);
		
		moveleft = new JButton();
		moveleft.setText("Move Left");
		add(moveleft);
		moveleft.addActionListener(control);
	}

	public JButton getMoveup() {
		return moveup;
	}

	public JButton getMovedown() {
		return movedown;
	}

	public JButton getMoveright() {
		return moveright;
	}

	public JButton getMoveleft() {
		return moveleft;
	}
	

}
