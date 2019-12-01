//A program used for practicing methods
public class BuildingBlocks { 

	public static int adder(int left, int middle, int right){
		int sum = left+middle+right;
		return sum;
	}
	
	
	public static double add(int left, int middle, double right){
		
		double sums = (left/(middle*right));
		return  sums;
	} 
	
	
	
	
	public static void main(String[] args) {
		//Question 1. 
		/* Modify the following lines of code so that you ask the user
		 * for three values and use those values instead of 10,20,50
		 */
		
		Magic.println("Please enter three values");
		int a = Magic.nextInt();
		int b = Magic.nextInt();
		int c = Magic.nextInt();
		
		int ans = adder(a,b,c);
		Magic.println("The answer is "+ans);
		
		Magic.println("Please enter three more values");
		 int d = Magic.nextInt();
		 int e = Magic.nextInt();
		 double f = Magic.nextDouble();
		
		double answ = add(d,e,f);
		
		Magic.println("The answer is "+answ);
		
		double answer = add(30, 50, 4.5);
		Magic.println("The answer is "+answer);
		
	}
		//Question 2. 
		/* Copy the code for adder and change it in the following ways
		 * 1. Make the return type a double
		 * 2. Make the third paramater a double
		 * 3. Make it so that rather than adding the the values you divide the first value
		 * by the product of the second two.
		 * e.g., if you passed it the values 20, 2, 2.5 then you would return 4 (20/(2*2.5) = 20/5 = 4)
		 */
		
		
		
		
		
		
		
		//Question 3
		/* Call the method you wrote in question 2 with three hard-coded values, no need to use user input
		 * print out the value IN THE MAIN METHOD
		 */
		
		//Question 4
		/* Copy the code for adder and change the copy into a method that returns nothing, but instead
		 * prints out the message IN THE NEW ADDER METHOD. Call this new adder method in the main.
		 */
		
		
		//Question 5
		/* copy the code for adder and change the copy into a method has no parameters, but instead 
		 * asks the user for three values. Return the value to main like the original. Then call this
		 * method from the main and print out the answer IN THE MAIN METHOD. 
		 */
		
	}


