
public class StartA {

	public static int[] Swappysort(int[] origin) {
		
		int[] copy = origin;
		int swap1 = 0;
		int swap2 = 0;
		
		
		for (int i = 0; i < origin.length - 1; i++) {
			for (int j = (origin.length - 1); j > i; j--) {
				
				if (copy[j] < copy[j - 1]) {
					
					swap1 = copy[j];
					swap2 = copy[j - 1];
					
					copy[j] = swap2;
					copy[j - 1] = swap1;
					
					
				}
				
			}
			
		}
		
		
		return copy;
		
		
	}
	
	
	public static int[] PlayingCard(int[] origin) {
		int[] copy = origin;
		int temp = 0;
		int sub = 0;
		
		for (int i = 1; i < copy.length - 1; i++) {
			
			temp = copy[i];
			sub = i;
			
			while (sub > 0 && copy[sub - 1] > temp) {
				
				copy[sub] = copy[sub-1];
				sub--;
				
				
			}
			
			copy[sub] = temp;
			
		}
	
		return copy;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int[] origin = new int[Magic.random(10)];
		
		for (int i = 0; i < origin.length; i++) {
			origin[i] = Magic.random(10);		
	}
	
	
		
		
		int[] copy = Swappysort(origin);
		Magic.println("Swappysort");
		for (int j = 0; j < copy.length; j++ ) {
			
			Magic.print(copy[j]+", ");

}
	
		copy = PlayingCard(origin);
		Magic.println("Playing card");
		for (int i = 0; i < copy.length; i++ ) {
			
			Magic.print(copy[i]+", ");

}
		
		
	
	}
}
