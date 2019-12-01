import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
public class Controller implements ActionListener {
	
	ActionListener controller;
	private Model model;
	private StartD view;
	ButtonPanel buttons;
	
	public Controller() {
		model = new Model(this);
		view = new StartD(this);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getButtonPanel().getButton1()) {
			model.firstButton(3);
		}
		
		if (e.getSource() == view.getButtonPanel().getButton2()) {
			model.secondButton(5);
		}
		if (e.getSource() == view.getButtonPanel().getButton3()) {
			model.thirdButton(7);
		}
		
		int l1 = model.getLabel1();
		int l2 = model.getLabel2();
		int l3 = model.getLabel3();
		
		view.updateLabels(l1, l2, l3);
		
	}

	

}
