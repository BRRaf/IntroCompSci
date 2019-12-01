
public class StartBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int choice = 0;
		int sum = 0;
		int count = 0;
		
		
		while (choice == 0){
		Magic.println("Please input an odd number. To end this loop, enter an even number ");
		int input = Magic.nextInt();
		int remainder = (input %2);	
			if (remainder == 0 ){
				Magic.println("This is an even number, time to calculate the average! ");
				choice = 1;
			} else {
				sum = sum + input;
				count = count + 1;
			}
		
		}	
		
		
			int avg = sum/count;
			int avgRem = avg%3;
			
			
			if (avgRem == 0) {
				if (avg >= 120) {
					Magic.println("Hello");
					}else {
					 Magic.println("Goodbye");
				}
			}else {
				if (avg >=120 ) {
					Magic.println("Neither");
					
				}else {
					Magic.println("Overwatch");
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
