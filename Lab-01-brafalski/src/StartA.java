// created by Ben Rafalski with help from Professor Block's Magic.Java to create a pregnency calculator
public class StartA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Magic.println("Congratulations on being pregnant! Please enter your LMP so that the program can calculate your child's birdate!" );
		
		int month = -1;
		
		int date = -1;
		
		int year = -1;
		
		int input = 0;
		
		while (month == -1) {
			Magic.println("Please enter the Month!");
			input = Magic.nextInt();
				
				if (input < 1) {
					Magic.println("That's not a real month! try again.");
				}else if(input > 12) {
					Magic.println("That's not a real month! try again.");
				}else {
					month = input;
					Magic.println("Yay! you entered a correct month! Now for the next date!");
				}
			
			
			
			
			
		}
			while (date == -1) {
				Magic.println("Please enter the specific date!");
				input = Magic.nextInt();
				
					if (input < 1){
						Magic.println("That's not a real date! try again.");
						
					}else if (input > 31) {
						Magic.println("That's not a real date! try again.");
					
					}else if (month == 2 && input > 29) {
						Magic.println("That date doesn't match up with the month! try again.");
					
					}else if ((month == 4 || month==6 || month==9 || month==11) && input > 30 ) {
						Magic.println("That date doesn't match up with the month! try again.");
					
					}else {
						date = input;
						Magic.println("Yay! you've entered a correct date! Now for the year");
					}
					
			}	
					
				
			while (year == -1) {
				Magic.println("Please enter the year!");
				input = Magic.nextInt();
				
				if ((input%4) == 0 && month == 2 && date == 29  ) {
					year = input;
					
					Magic.println("Wow! how rare! now to calculate the birthdate!");
				
				}else if((input%4 != 0) && month == 2 && date == 29) {
					Magic.println("That year doesn't match up with the month or the date! try again.");
				
				}else {
					year = input;
					Magic.println("What a great year! Now to calculate the birthdate!");
				}
					
				
			  }
			
			
			
				
			boolean leapYear = true;	
			
			if ((year%4)==0) {
				leapYear = true;
				}	
			else {
				leapYear = false;
			}
			
			Magic.println("The current date you've entered is "+month+"/"+date+"/"+year);
			
			
			int countdown = 280; 
			
			while (countdown > 0) {
				Magic.println("Ba");
				Magic.println("Da");
				
				if (month == 12) {
					if (date < 32) {
						date = date + 1;
						countdown = countdown - 1;
					}
					if (date > 31) {
						year = year + 1;
						date = 1;
						month = 1;
						countdown = countdown - 1;
					}
				}
				
				if (month == 2) {
					if (leapYear == true) {
						if (date < 30) {
							date = date + 1;
							countdown = countdown - 1;
						}
						
						if (date > 29) {
							date = 1;
							month = month + 1;
							countdown = countdown - 1;
						}
						
					}else {
						if (date < 29) {
							date = date + 1;
							countdown = countdown - 1;
						}
						
						if (date > 28) {
							date = 1;
							month = month + 1;
							countdown = countdown - 1;
						}
					}
					 
					
			
				}
				
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
					if (date < 32) {
						date = date + 1;
						countdown = countdown - 1;
					}
					
					if (date > 31) {
						date = 1;
						month = month + 1;
						countdown = countdown - 1;
					}
					
				}
					if (month == 4 || month == 6 || month == 9 || month == 11) {
						if (date < 31) {
							date = date + 1;
							countdown = countdown - 1;
						}
						
						if (date > 30) {
							date = 1;
							month = month + 1;
							countdown = countdown - 1;
						}
					
				}
			
			
			
			}
		
		
			Magic.println("The day your child will be born is around "+month+"/"+date+"/"+year+"!");
		
	}
}
			
			
		
