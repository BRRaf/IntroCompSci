
public class BuildingBlocks {
	
	public static void main(String[] args) {
		
		//Question 1
		/* Copy the code below and use it to create a new multidimesonal array
		 * with different dimensions and different values, then print it out.
		 */
		int my2dArray[][] = new int[2][3];
		my2dArray[0][0] = 3;
		my2dArray[0][1] = 10;
		my2dArray[0][2] = 22;
		
		my2dArray[1][0] = 66;
		my2dArray[1][1] = 55;
		my2dArray[1][2] = 99;
		
		for(int row=0;row<my2dArray.length;row++){
			for(int col =0;col<my2dArray[row].length;col++){
				System.out.println(my2dArray[row][col]);
			}
		}
		
		
		int new2dArray[][] = new int [3][2];
		new2dArray[0][0] = 1;
		new2dArray[0][1] = 1;
		
		new2dArray[1][0] = 2;
		new2dArray[1][1] = 3;
		
		new2dArray[2][0] = 4;
		new2dArray[2][1] = 5;
		
		for(int row=0;row<new2dArray.length;row++){
			for(int col =0;col<new2dArray[row].length;col++){
				System.out.println(new2dArray[row][col]);
			}
		}
		
		
		
		//Question 2
		/* Using the enum CaffeinatedBeverages as a base. Create a new enum
		 * called NonCaffeinatedBeverages, with at least three non-caffeinated beverages
		 * Additionally, create a copy of the switch statement that works with your enum
		 */
		
		CaffeinatedBeverages soda = CaffeinatedBeverages.Coke;
		switch(soda){
		case Coke:
			System.out.println("It's full of sugar");
			break;
		case Coffee:
			System.out.println("it's the best");
			break;
		case Tea:
			System.out.println("It's alright I guess");
			break;
		default:
			System.out.println("Never get here, above all the cases!");
		}
		
		NonCaffeinatedBeverages liquid = NonCaffeinatedBeverages.Water;
		switch(liquid){
		case Milk:
			System.out.println("option Milk has been chosen");
			break;
		case Smoothie:
			System.out.println("option Smoothie has been chosen");
			break;
		case Water:
			System.out.println("The most delicious option has been chosen");
			break;
		default:
			System.out.println("You did something wrong.");
		}
		
		
		
		
		
		
		
		
		
		
		//Question 3
		/* Expand on the code below by calling every method in HoldsTwoVariables
		 * on the objects holder and secondHolder
		 * If a method returns a value, print the value
		 * If a method changes a member variable in one of the HoldsTwoVariable objects
		 * 		use toString() to print out the object.  
		 */
		HoldsTwoVariables holder = new HoldsTwoVariables();
			
		HoldsTwoVariables secondHolder = new HoldsTwoVariables(10,20);
		
		holder.setVariable1(3);
		
		holder.setVariable2(7);
		
		System.out.println("The bigger value is "+holder.getBigger());
		
		System.out.println("holder :"+holder.toString());
		
		holder.addOtherHolder(secondHolder);
		
		System.out.println("After adding--"+holder.toString());
	
		
		
		
		System.out.println("The bigger value in the second holder is " + secondHolder.getBigger());
		System.out.println("secondHolder: " +secondHolder.toString());
		secondHolder.addOtherHolder(holder);
		
		System.out.println("after adding again--"+secondHolder.toString());

		
		//Question 4
		/* Using HoldsTwoVariables as a base, Make a new Class called HoldsThreeVariables
		 * It's the same as HoldsTwoVariables, except it has three member variables
		 * 
		 * Also, the member variables cannot be named variable1, variable2, and variable3
		 * name them something different. 
		 * 
		 * Implement versions of all of the HoldsTwoVariable methods in HoldsThreeVariables but
		 * make adjustments for the fact there are now three variables
		 */
		
		//Question 5
		/* Create two HoldsThreeVariables objects. 
		 * One that uses the no-parameter constructor and one that uses the three-parameter constructor
		 * Call all of the methods you wrote in Question 4 on at least one of these objects
		 */
		
		
		HoldsThreeVariables schmucks = new HoldsThreeVariables();
		
		HoldsThreeVariables stupidschmucks = new HoldsThreeVariables(5,3,21687357);
		
		schmucks.setLarry(1);
		schmucks.setCurly(2);
		schmucks.setMoe(3);
		
		System.out.println("The biggest Schmuck is "+schmucks.getBigger());
		
		System.out.println("Schmucks: "+schmucks.toString());
		
		schmucks.addOtherSchmucks(stupidschmucks);
		
		System.out.println("after adding--"+schmucks.toString());
		
		
		
		
		System.out.println("The stupidist Schmuck is "+stupidschmucks.getBigger());
		
		System.out.println("Schmucks: "+stupidschmucks.toString());
		
		schmucks.addOtherSchmucks(schmucks);
		
		System.out.println("after adding--"+stupidschmucks.toString());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
