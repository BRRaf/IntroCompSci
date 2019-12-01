import java.util.Scanner;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int n, int d)throws DivideByZerio {
		num = n;
		den = d;
		if (den == 0)  {
			throw new DivideByZerio("Den can't be zero you dumb.");
			
		}
	}
			
	
	
	public String toString() {
		return num+"/"+den;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Fraction frac = null;
		boolean invalid;
		
		do {
			invalid = false;
			System.out.println("Enter a numerator and a dem, don't be dumb");
			int num = scan.nextInt();
		int den = scan.nextInt();
			
		try {
			frac = new Fraction(num,den);
		} catch (DivideByZerio e) {
			invalid = true;
			System.out.println(e.getMessage());
		}
		} while (invalid);	
		System.out.println("Fraction you entered is "+frac.toString());

	}
}
