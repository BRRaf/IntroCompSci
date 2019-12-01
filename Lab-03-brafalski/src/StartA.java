// Created by Ben Rafalski with help from Professor Block's Magic.java to swap elements in a list
public class StartA {

	
	
	public static int[] Swappysort(int[] origin) {
		
		int[] copy = origin;
		int swap1 = 0;
		int swap2 = 0;
		
		for (int i = 0; i < (copy.length - 1); i++) {
			
			for (int si = (copy.length - 1); si > (i); si--){
				
				if (copy[si] < copy[si-1]){
					
					swap1 = copy[si-1];
					swap2 = copy[si];
					copy[si] = swap1;
					copy[si-1] = swap2;
				
					
					
					
					
				}else {
					Magic.println("");
				}
			}
			
			
		}
		
		
		return copy;
	}
	
	
		public static int[] playingCard(int[] origin) {
			
			int[] copy = origin;
			int temp = 0;
			int sub = 0;
			
			for (int i = 1; i < (copy.length - 1); i++) {
				temp = copy[i];
				sub = i;
				while (sub > 0 && copy[sub-1] > temp) {
					copy[sub] = copy[sub-1];
					sub--;
				}
				
				copy[sub] = temp;
				
			}
			
			return copy;
			
		}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Magic.println("Please enter 15 integers");
		
		int[] origin = new int[Magic.random(100)];
		
		for (int i = 0; i < origin.length; i++) {
			origin[i] = Magic.random(500);
		
		}
		long start = System.currentTimeMillis();
		int[] copy = Swappysort(origin);
		Magic.println("Swappysort");
		for (int j = 0; j < copy.length; j++ ) {
			
			Magic.print(copy[j]+", ");
			
			
		}
		long end = System.currentTimeMillis();
		Magic.println(end - start);
		
		
		Magic.println("");
		Magic.println("Card sort:");
		int[] copy2 = playingCard(origin);
		
		for (int j = 0; j < copy2.length; j++ ) {
			Magic.print(copy2[j]+", ");
		
		}
		
	}

}
