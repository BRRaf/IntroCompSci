
public class StartD {

	
	
	public static double KmtoMile(double km) {
		
		double mile = km * .621;
		
		return mile;
		
	}
	
	
	
	public static int[] options(int param) {
		int[] list = new int[param];
			if (list.length < 0){
				return list;
				
			}else if (list.length == 0) {
				
				list[0] = 0;
				return list;
				
				
			}
			else {
				for(int i = 0; i < list.length; i++) {
					list[i] = i;
				}
			}
			return list;
	}
	
	
	public static int[] A(int param) {
		
		int[] list = new int[param];
		
		
		for (int j = 0; j < list.length; j++) {
			
			Magic.println("Please enter an integer");
			list[j] = Magic.nextInt();
			
		}
		return list;
	}
	
	
	public static int B(int[] list) {
		
		int largest = 0;
		
		for (int i = 0; i < list.length; i++) {
			
			if (list[i] >= 0) {
				
				largest = list[i];
				
			}
			
			
		}
		
		return largest;
	}
	
	
	public static double avg(int[] list) {
		int sum = 0;
		
		for (int i = 0; i < 0; i++) {
			sum += list[i];
		}
		
		double average = sum/list.length;
		
		return average;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		

		
		
			
	}

}
