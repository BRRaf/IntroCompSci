
public class TwoModel {

	private int Label1;
	private int Label2;
	private int Label3;
	private Controller control;
	private TwoFramesController twocontrol;
	
	public TwoModel(TwoFramesController c) {
		Label1 = 0;
		Label2 = 0;
		Label3 = 0;
		twocontrol = c;
		
	}
	

	
	
	public void firstButton(int inc) {
		
		Label1 += inc;
		Label2 += inc;
		
	}
	
	public void secondButton(int inc) {
		
		Label2 += inc;
		Label3 += inc;
	}
	
	public void thirdButton(int inc) {
		
		Label3 += inc;
		Label1 += inc;
	}
	
	
	
	
	
	public int getLabel1() {
		return Label1;
	}
	
	public void setLabel1(int label1) {
		Label1 = label1;
	}
	public int getLabel2() {
		return Label2;
	}
	public void setLabel2(int label2) {
		Label2 = label2;
	}
	public int getLabel3() {
		return Label3;
	}
	public void setLabel3(int label3) {
		Label3 = label3;
	}
	
	
	
}
