import java.util.Scanner;

public class LitersConverter {

	
	public static double Convert(String number, String measure) {
		double converted = 1.0;
		if (measure.equals("ml") || measure.equals("Ml") || measure.equals("mL") || measure.equals("ML")) {
			converted = Double.parseDouble(number) / 1000;
		} else if(measure.equals("cl") || measure.equals("Cl") || measure.equals("cL") || measure.equals("CL")) {
			 converted = Double.parseDouble(number) / 100;
		} else if (measure.equals("l") || measure.equals("L")) {
			 converted = Double.parseDouble(number);
		}
		
		return converted;
	}
	
	public static double StringSplitSpace (String input) throws LitersException {
		String[] data;
		String check = "";
		String number = "";
		
		
		
		try {
		 data = input.split(" ");
		 check = data[1];
		 number = data[0];
		 

			if (check.equals("ml") || check.equals("cl") || check.equals("l") || check.equals("ML") || check.equals("CL") || check.equals("L") || check.equals("mL") || check.equals("cL") || check.equals("Ml") || check.equals("Cl") ) {
			double converted = Convert(number, check);
			return converted;
			} else {
				throw new LitersException("That is not an appropriate measurement");
				
			}
		} catch (Exception e) {
			String checkcatch = "";
			String numbercatch = "";
			boolean lengthtrue = false;
			int i = 0;
			data = input.split("");
			
			while (!lengthtrue) {
				
					
					numbercatch += data[i];
					i += 1;
				 if (data[i].equals("m") || data[i].equals("M") || data[i].equals("c")  || data[i].equals("C")  || data[i].equals("l")  || data[i].equals("L") ) {
					lengthtrue = true;
				}
				
				
			}
			
			
			lengthtrue = false;
			int end = i + 2;
			while (!lengthtrue) {
				if (i != end) {
					checkcatch  += data[i];
					i++;
				}
				if ( i == end) {
					lengthtrue = true;
				}
				
				
			}
			
			
			
			if (checkcatch.equals("ml") || checkcatch.equals("cl") || checkcatch.equals("l") || checkcatch.equals("ML") || check.equals("CL") || check.equals("L") || check.equals("mL") || check.equals("cL") || check.equals("Ml") || check.equals("Cl") ) {
				double converted = Convert(numbercatch, checkcatch);
				return converted;
				} else {
					throw new LitersException("That is not an appropriate measurement");
					
				}
			
		}
		

			
	}
	
	
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean check;
		double answer = 0.0;
		
		do {
			check = false;
			System.out.println("Please enter a value in ml, cl, or L and it will be converted to liters.");
		
			String input = scan.nextLine();
		
		try {
			 answer = StringSplitSpace(input);
		} catch (LitersException e) {
			check = true;
			System.out.println(e.getMessage());
		}
		} while (check);
		
		
		
		
		System.out.println("Your input converted to "+answer+" Liters");
		
	}

}
