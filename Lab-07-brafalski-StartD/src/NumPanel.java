import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumPanel extends JPanel {
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;

	
	public NumPanel() {
		super();
		
		Label1 = new JLabel();
		Label2 = new JLabel();
		Label3 = new JLabel();
		
		Label1.setText("Label 1:"+0);
		Label2.setText("Label 2:"+0);
		Label3.setText("Label 3:"+0);
		
		add(Label1);
		add(Label2);
		add(Label3);
	}

	
	
	public void setallLabels(int label1, int label2, int label3) {
		Label1.setText("Label 1:"+label1);
		Label2.setText("Label 2:"+label2);
		Label3.setText("Label 3:"+label3);
	}
	
	
	
	
	
	

	public JLabel getLabel1() {
		return Label1;
	}


	public void setLabel1(JLabel label1) {
		Label1 = label1;
	}


	public JLabel getLabel2() {
		return Label2;
	}


	public void setLabel2(JLabel label2) {
		Label2 = label2;
	}


	public JLabel getLabel3() {
		return Label3;
	}


	public void setLabel3(JLabel label3) {
		Label3 = label3;
	}
	
	
	
	
}
