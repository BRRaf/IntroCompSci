
public class StartD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		int[] numbers = new int[5];
		Magic.println("Please enter 5 values");
		for (int index = 0; index < numbers.length; index++ ){
			numbers[index]= Magic.nextInt();
			total+=numbers[index];
			
		}
		
		int avg = total/numbers.length;
		
		if (avg > 100){
			Magic.println("The teachers were really nice this year, huh.");
		} else if (avg > 90) { 	
			Magic.println("The class average is an A");
		} else if (avg > 80) { 	
			Magic.println("The class average is an B");
		} else if (avg > 70) { 	
			Magic.println("The class average is an C");
		} else if (avg > 60) { 	
			Magic.println("The class average is an D");
		}	else {
			Magic.println("You have some problems");
		}
		
	
		
		
		int intnum = 0;
		int cursum = 0;
		int count = 0;
		
		do{ 
			
			Magic.println("Please input postive values. If you want to stop, enter a non positive value");
			
			intnum = Magic.nextInt();
			count = count+1;
			cursum = cursum + intnum;
			
		}while (intnum >= 0);
			cursum = cursum - intnum;
			count = count - 1;
			int av = cursum/count;
			Magic.println("The average of all values typed in is " +av);
			
			
		 int up = 0;
		 int x = -1;
		 int y = -1;
		 while (up < 5) {
			 if (x == -1){
				 Magic.println("Please enter a positive x value"); 
				 x = Magic.nextInt();
			 } else if (x < 0) {
					 up = 50;
				 } else if (y == -1){
						 Magic.println("Please enter a positive y value"); 
						 y = Magic.nextInt();
				 } else if (y < 0) {
							 up = 50;
						 } else {
							 
							 Magic.println("Please enter the height");
							 int height = Magic.nextInt();
							 Magic.println("Please enter the length");
							 int length = Magic.nextInt(); 
							 Magic.println("Please enter the color");
							 String color = Magic.nextLine(); 
							 
							 if (x < 0 ) {
								 up = 6;
							 } else if (y < 0) {
								 up = 6;
							
							 } else {
								 
								 Magic.drawOval(x, y, length, height, color);
								 up = 6;
							 }

						 }
			 
		 }
		
		 Magic.println("Please enter a size for a list");
		 int Array[] = new int [Magic.nextInt()];
		 
		 	for(int max = 0; max < Array.length; max++) {
		 		Magic.println("Please enter positive double digit numbers");
		 		int put = Magic.nextInt();
		 		if (put > 99) {
		 			Magic.println("That's triple digits retype all numbers again");
		 			max = -1;
		 			} else if (put < 10) {
		 				Magic.println("That's below the positive double digits retype all numbers again");
		 				max = -1;
		 			} else {
		 				Array[max] = put;
		 			}
		 		
		 
		 		
		 	}
		 	
		 
		 	
		 int sumB = 0;
		 for (int max = 0; max < Array.length; max++){
			 sumB += Array[max];
		 }
		  
		  Magic.println("the average of the double digit numbers is "+(sumB/Array.length));
		 	
		 
		 
		 
		 
		 
	}
	
}
		 
		
