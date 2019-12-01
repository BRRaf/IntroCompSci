import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	JButton moveRightButton; 
	JButton moveDownButton; 
	JButton moveUpButton;
	JButton moveLeftButton;
	
	JButton sRightButton; 
	JButton sDownButton; 
	JButton sUpButton;
	JButton sLeftButton;
	

	
	public ButtonPanel(ActionListener controller){
		super();

		moveRightButton=null;
		moveDownButton=null;
		moveUpButton=null;
		moveLeftButton=null;
		
		sRightButton=null;
		sDownButton=null;
		sUpButton=null;
		sLeftButton=null;
		
		
		sRightButton = new JButton();
		sRightButton.setText("Move Square Right");
		add(sRightButton);
		sRightButton.addActionListener(controller);
		
		sDownButton = new JButton();
		sDownButton.setText("Move Square Down");
		add(sDownButton);
		sDownButton.addActionListener(controller);
		
		sUpButton = new JButton();
		sUpButton.setText("Move Square Up");
		add(sUpButton);
		sUpButton.addActionListener(controller);
		
		sLeftButton = new JButton();
		sLeftButton.setText("Move Square Left");
		add(sLeftButton);
		sLeftButton.addActionListener(controller);
		
		moveRightButton = new JButton();
		moveRightButton.setText("Move Right");
		add(moveRightButton);
		moveRightButton.addActionListener(controller);
		
		moveDownButton = new JButton();
		moveDownButton.setText("Move Down");
		add(moveDownButton);
		moveDownButton.addActionListener(controller);
		
		moveUpButton = new JButton();
		moveUpButton.setText("Move Up");
		add(moveUpButton);
		moveUpButton.addActionListener(controller);
		
		moveLeftButton = new JButton();
		moveLeftButton.setText("Move Left");
		add(moveLeftButton);
		moveLeftButton.addActionListener(controller);
		
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(100,900));	
	}
	
	public JButton getRightButton(){
		return moveRightButton;
	}
	
	public JButton getDownButton(){
		return moveDownButton;
	}
	
	public JButton getUpButton() {
		return moveUpButton;
	}
	
	public JButton getLeftButton() {
		return moveLeftButton;
	}
	
	public JButton sRightButton(){
		return sRightButton;
	}
	
	public JButton sDownButton(){
		return sDownButton;
	}
	
	public JButton sUpButton() {
		return sUpButton;
	}
	
	public JButton sLeftButton() {
		return sLeftButton;
	}
}