
public class HoldsThreeVariables {
	private int Larry;
	private int Curly;
	private int Moe;
	
	
	//default constructor
	public HoldsThreeVariables() {
		Larry = 0;
		Curly = 0;
		Moe = 0;
	}
	
	
	//Question 5
	public HoldsThreeVariables(int v1, int v2, int v3) {
		Larry = v1;
		Curly = v2;
		Moe = v3;
	}
	
	
	
	public int getBigger() {
		if (Larry > Curly && Larry > Moe) {
			return Larry;
		} else if (Curly > Larry && Curly > Moe) {
			return Curly;
		} else {
			return Moe;
		}
		
	}
		
	public void addOtherSchmucks(HoldsThreeVariables other) {
			Larry+=other.Larry;
			Curly+=other.Curly;
			Moe+=other.Moe;
	}
		
	public int getLarry() {
		return Larry;
	}
	
	public void setLarry(int var) {
		Larry = var;
	}
	
	
	public int getCurly() {
		return Curly;
	}
	
	public void setCurly(int var) {
		Curly = var;
	}
	
	
	public int getMoe() {
		return Moe;
	}
	
	public void setMoe(int var) {
		Moe = var;
	}
	
	public String toString() {
		String rtnString = "The value of Larry is "+Larry+", The value of Curly is "+Curly+", The value of Moe is "+Moe;
		return rtnString;
	}
		
}
