import java.util.Scanner;

public class LunarCalander {
	
	boolean check;
	public LunarCalander() {
		
		check = false;
		
		
		
	}
	
	public static int monthCheck(int month) throws LunarException {
		Scanner scan = new Scanner(System.in);
		if (month < 1 || month > 12) {
			throw new LunarException("That's not a real month. try again");
			
		}
		return month;
		
	}
	
	public static int dateCheck(int month, int input) throws LunarException {
		Scanner scan = new Scanner(System.in);
		
		
		if (input < 1){
			throw new LunarException("That's not a real date. try again");
			
		}else if (input > 31) {
			throw new LunarException("That's not a real date. try again");
		
		}else if (month == 2 && input > 29) {
			throw new LunarException("That's not a real date. try again");
		
		}else if ((month == 4 || month==6 || month==9 || month==11) && input > 30 ) {
			throw new LunarException("That's not a real date. try again");		
		}
		return input;
		
	}
	
	public static int checkYear(int month, int date, int input) throws LunarException {
		Scanner scan = new Scanner(System.in);
		
		
		//if ((input%4) == 0 && month == 2 && date == 29  ) {
		//	return input;
			
			//year = input;
			//System.out.println("Wow! how rare! now to calculate the birthdate!");
		
		 if(((input%4 != 0) && month == 2 && date == 29) || input < 0) {
			
			throw new LunarException("That year doesn't match up with the month or the date! try again.");
			
			
		 }
		 return input;
		 
		//}else {
			//year = input;
			//System.out.println("What a great year! Now to calculate the birthdate!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Congratulations on being pregnant! Please enter your LMP so that the program can calculate your child's birdate!" );
		
		int month  = -1 ;	
		int date = -1;
		
		int year = -1;
		
		int input = 0;
		
		while (input == 0) {
			try {
			System.out.println("Please enter the Month!");
			input = scan.nextInt();	
			 monthCheck(input);
			} catch	(LunarException e) {
				System.out.println(e.getMessage());
				input = 0;
				}
			
			
		}
		
		
		month = input;
		System.out.println("Yay! you entered a correct month! Now for the next date!");
		
		input = 0;
		
			while (input == 0) {
				try {
					System.out.println("Please enter the specific date!");
				input = scan.nextInt();
				 dateCheck(month, input);
				} catch (LunarException e) {	
					System.out.println(e.getMessage());
					input = 0;
				}
			}	
			
			
			
			date = input;
			System.out.println("Yay! you entered a correct date! Now for the year!");
			input = -1;
			
			while (input == -1) {
				try {
					System.out.println("Please enter the year!");
					 input = scan.nextInt();
					 checkYear(month, date, input);
					
				}catch (LunarException e) {
					System.out.println(e.getMessage());
					input = -1;
				}
					
				
			  }
			
			year = input;
			System.out.println("What a great year! Now to calculate the birthdate!");
			
				
			boolean leapYear = true;	
			
			if ((year%4)==0) {
				leapYear = true;
				}	
			else {
				leapYear = false;
			}
			
			System.out.println("The current date you've entered is "+month+"/"+date+"/"+year);
			
			
			int countdown = 280; 
			
			while (countdown > 0) {
				System.out.println("Ba");
				System.out.println("Da");
				
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
		
		
			System.out.println("The day your child will be born is around "+month+"/"+date+"/"+year+"!");
		
	}
}
			
			
		
