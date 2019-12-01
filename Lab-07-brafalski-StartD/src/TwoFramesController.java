import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class TwoFramesController implements ActionListener {
	
	ActionListener twocontroller;
	private TwoModel model;
	private TwoFrames twoview;
	ButtonPanel buttons;
	
	public TwoFramesController() {
		model = new TwoModel(this);
		twoview = new TwoFrames(this);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == twoview.getButtonPanel().getButton1()) {
			model.firstButton(3);
		}
		
		if (e.getSource() == twoview.getButtonPanel().getButton2()) {
			model.secondButton(5);
		}
		if (e.getSource() == twoview.getButtonPanel().getButton3()) {
			model.thirdButton(7);
		}
		
		int l1 = model.getLabel1();
		int l2 = model.getLabel2();
		int l3 = model.getLabel3();
		
		twoview.updateLabels(l1, l2, l3);
		
	}
	

	


}
