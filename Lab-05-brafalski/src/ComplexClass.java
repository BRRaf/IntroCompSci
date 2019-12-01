
public class ComplexClass {
	private double a1;
	private double a2;
	private double b1;
	private double b2;
	private double z1;
	private double z2;
	private String answer;
	
	public ComplexClass() {
		a1 = 0;
		a2 = 0;
		b1 = 0;
		b2 = 0;
		z1 = 0;
		z2 = 0;
		answer = "";
	}
	
	public void Seta1(int num) {
		a1 = num;
	}
	
	public void Setb1(int num) {
		b1 = num;
	}
	
	public void Seta2(int num) {
		a2 = num;
	}
	
	public void Setb2(int num) {
		b2 = num;
	}
	
	
	
	public ComplexClass(double num1, double num2, double num3, double num4) {
		a1 = num1;
		b1 = num3;
		a2 = num2;
		b2 = num4;
		
		z1 = 0;
		z2 = 0;
		answer = "";
	}
	
	public String ComplexAdd() {
		
		z1 = a1 + a2;
		z2 = b1 + b2;
		
		answer = z1+" + "+z2+"i"; 
		
		return answer;
	}
	
	
	public String ComplexSub() {
		z1 = a1 + -(a2);
		z2 = b1 + -(b2);
		
		answer = z1+" + "+z2+"i";
		
		return answer;
		
	}
	
	public String ComplexMul() {
		
		double con1 = a1 * a2;
		double con2 = a1 * b2;
		double con3 = b1 * a2;
		double con4 = b1 * b2;
		
		z1 = con1 - con4;
		z2 = con2 + con3;
		
		answer = z1+" + "+z2+"i";
		
		return answer;
		
	}
	
	public String ComplexDiv() {
		
		double top1 = a1 * a2;
		double top2 = a1 * -(b2);
		double top3 = b1 * a2;
		double top4 = b1 * -(b2);
		
		double bot1 = b1 * b2;
		double bot2 = b1 * -(b2);
		double bot3 = b2 * b1;
		double bot4 = b2 * -(b2);
		
		double top5 = top1 + -(top4);
		double top6 = top2 + top3;
		
		double bot5 = bot1 - bot4;
		
		
		double fraction1 = top5/bot5;
		double fraction2 = top6/bot5;
		
		z1 = fraction1;
		z2 = fraction2;
		
		answer = top5+"/"+bot5+" - "+top6+"/"+bot5+"i";
		
		return answer;
		
		
	}
	
	public String ComplexCon() {
		
	
		
		answer = "the first complex conjugate equals "+a1+" - "+ b1 +"i, the second complex conjugate equals "+a2+" - "+b2+"i";
		
		return answer;
		
	}
	
	public String Complexabs() {
		
		double a3 = (a1 * a1);
		double b3 = (b1 * b1);
		double c = (a3 + b3)/(a3 + b3);
		
		double a4 = (a2 * a2);
		double b4 = (b2 * b2);
		double c2 = (a4 + b4)/(a4 + b4);
		
		answer = "The absolute value the first complex number is "+c+", while the second absolute value of the second complex value is "+c2;
		return answer;
	}
	
	
	public String toString() {
		
		String rtn = "The final value is "+answer;
		return rtn;
		
		
	}
	
	
	
	
	
	
	
}
