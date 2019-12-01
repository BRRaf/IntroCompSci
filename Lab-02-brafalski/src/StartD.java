

public class StartD {

	
	public static double kmToMile(double km){
		
		double miles = 0.621 * km;
		
		return miles;
		
		
	}
	
	public static void drawCircle(int x, int y, int diameter, String color) {
		
		Magic.drawOval(x, y, diameter, diameter, color);
		
		
	}
	
	
	public static int[] list() {
		
		Magic.print("Please enter the amount of integers you want in the list.");
		
		int input = Magic.nextInt();
		int listnum = 0;
		int[] array = new int [input];
		
		while (input != 0) {
			Magic.println("please enter " +input+ " more numbers.");
			array[listnum] = Magic.nextInt();
			listnum = listnum + 1;
			input = input - 1;
			
			
			
		}
		
		return array;
		
	}
	
	
	public static double milesandFtToKm(double miles, double ft) {
		
		double fttoml = ft/5280;
		double fullml = fttoml + miles;
		double kmconv = fullml * 1.609;
		
		return kmconv;
		
	}
	
	public static void kmtomlft(int km) {
		
		double mile = km * 0.621371;
		int ml = (int) mile;
		
		double ft = 5280*(mile - ml);
		
		Magic.println("km to mile/ft is "+ml+" miles and "+ft+" feet");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double convert = kmToMile(5);
		
		Magic.println("5 kilometers in miles is " +convert);
		
		
		drawCircle(50, 60, 200, "red");
		
		int[] result = list();
		for(int index = 0; index < result.length; index++) {
			Magic.println("Input number "+result[index]);
		}
		
		double fin = milesandFtToKm(20,5.2);
		Magic.println("The conversion from miles and ft to km is "+ fin);
		
		kmtomlft(2);
		
	}

}
