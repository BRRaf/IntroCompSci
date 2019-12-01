
public class BuildingBlocks {
	
	public static int average(int[] array){
		
		if (array.length == 0) {
			int avg = 0;
			return avg;
		}
		int total = 0;
		int length = array.length;
		for(int i =0; i < length;i++){
			total+=array[i];
		}
		int avg = total/length;
		return avg;
	}
	

	public static double product(double a, double b, double c){
		double value = a*b*c;
		return value;
	}
	
	public static void main(String[] args) {
		// Look in BuildingBlockTests for the questions

	}

}
