
public class SimpleObject {

	private int a;
	private int b;
	
	
	public SimpleObject() {
		
		a = 0;
		b = 0;
	}
	
	public SimpleObject(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	public void Seta(int var) {
		a = var;
	}
	
	public int Geta() {
		return a;
	}
	
	public void Setb(int var) {
		b = var;
	}
	
	public int Getb() {
		return b;
	}
	
	
	public boolean isASmaller() {
		boolean c = true;
		if (a < b) {
			return c;
		}else {
			c = false;
			return c;
		}
		
	}
	
}
