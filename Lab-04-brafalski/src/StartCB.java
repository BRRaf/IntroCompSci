
public class StartCB {
	
	
	
	
	public static String calc(double date, int month, int year) {
		
		for (int h = 0; h < 13; h++ ) {
			for (double i = 0; i < 29.53; i++) {
			
			if (month == 12 && date >= 31) {
				year = year + 1;
				month  = 1;
			
				if (i < 29) {
					date = 1;
				} else {
					date = .53;
				}
				
				
				
			}else if(month == 2 && date >= 28) {
				month = 3;
				date = 1;
				
				if (i < 29) {
					date = 1;
				} else {
					date = .53;
				}
				
				
			}else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && date >= 31) {
				month = month + 1;
				date = 1;
				
				if (i < 29) {
					date = 1;
				} else {
					date = .53;
				}
			
				
			}else if((month == 4 || month == 6 || month == 9 || month == 11) && date >= 30) {
				
				month = month + 1;
				date = 1;	
			
				if (i < 29) {
					date = 1;
				} else {
					date = .53;
				}
				
			}else {
				if (i < 29) {
					date += 1;
				} else {
					date += .53;
				}
				
			}
		}
			int day = 0;
			
			if (date - (int) date >= .5) {
				day = (int) date + 1;
			} else {
				day = (int) date;
			}
			
			
			
		
		Magic.print(month+"/"+ day +"/"+year+", ");
		}
		
		
		
		int day = (int) date;
		String fdate = month+"/"+day+"/"+year;
		
		return fdate;
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Magic.println("Please enter the current year.");
		
		int year = Magic.nextInt();
		
		Magic.println("Please enter the current month");
		
		int month = Magic.nextInt();
		
		Magic.println("Please enter the current date");
		
		int date = Magic.nextInt();
		
		
		
		
		Magic.println("The date that was inputed is "+month+"/"+date+"/"+year);
		
		
		
		calc(date, month, year);
		
		
		
				
		
		
		
		
		
		
		
		
	}

}
