
public class StartD {

	
	public enum Nativefood {
		
		Italian, American, Indian, Thai, Korean, TexMex, Brazilian,
		
		
	}
	
	public static String cuisineif(Nativefood food) {
		String answer = "";
		if (food == Nativefood.Italian) {
			answer  = "Pasta";
			
			
			
		}else if(food == Nativefood.American) {
			answer = "Burger";}
		
		else if(food == Nativefood.Brazilian) {
		answer = "Churrasco";}
	
		else if(food == Nativefood.Indian) {
			answer = "Dal Makhani";}


		else if(food == Nativefood.Thai) {
			answer = "Tom Yum Goong";}

		else if(food == Nativefood.Korean) {
			answer = "Kimchi";}

		else if(food == Nativefood.TexMex) {
			answer = "Steak Fajitas";}
		else {
			Magic.print("error, not an option, try again");
			return "null";
		}
		return answer;
	}
	
	
	public static String cuisineswitch(Nativefood food) {
		
		String answer = "";
		
		switch(food) {
		
		case Italian:
			answer = "Pasta";
			break;
		case American:
			answer = "Burger";
			break;
		case Brazilian:
			answer = "Churrasco";
			break;
		case Korean:
			answer = "Kimchi";
			break;
		case Thai:
			answer = "Tom Yum Goong";
			break;
		case TexMex:
			answer = "Steak Fajitas";
			break;
		case Indian:
			answer = "Dal Makhani";
			break;
		default:
			answer = "error, this is not an option";
			
			
			
			
		
		}
		
		return answer;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void iterative() {
		
		int count = 0;
		int max = 0;
		
		Magic.println("Please input an integer");
		max = Magic.nextInt();
		
		while (count != (max + 1)) {
			
			
			Magic.println(count);
			count += 1;
			
			
			
		}
		count = 0;
		Magic.println("Please enter a second integer");
		max = Magic.nextInt();
		
		while (max != (count - 1)) {
		
		Magic.println(max);
		
		max -= 1;
		
		}
		
		
	}
	
	
	public static void Recursive1(int max, int count ) {
		
		if (count != (max + 1)) {
		Magic.println(count);
		count += 1;
		
		Recursive1(max, count);
		}
		
	}
	
	
public static void Recursive2(int max) {
		
		if (max != -1) {
		Magic.println(max);
		max -= 1;
		
		Recursive2(max);
		}
		
	}
	
	
	
	
	public static int[] MethodA(int list) {
		
		int[] Array = new int[list];
		
		for (int index = 0; index < Array.length; index++) {
			
			Magic.println("Please enter a value for number " +(index + 1)+ " in the list.");
			
			Array[index] = Magic.nextInt();
			
		}
		
		return Array;
		
		
	}
	
	public static int MethodB(int[] Array) {
	
	int largest = 0;
	int count = 0;
	
	while (count != Array.length) {
		
		if (Array[count] > largest) {
			largest = Array[count];
			
			
		}
		count += 1;
	}
	
	return largest;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		iterative();
		
		
		
		
		
		
		Magic.println("Please input an integer (recursive)");
		
		int max = Magic.nextInt();
		
		Recursive1(max,count);
		
		Magic.println("Please input a second integer(recursive2)");
		
		max = Magic.nextInt();
		
		Recursive2(max);
		
		
		
		
		final int waterFreeze = 32;
		final int waterBoil = 212;
		
		Magic.println("Please enter the amount of numbers you want in a list");
		
		int list = Magic.nextInt();
		
		int largest = MethodB(MethodA(list));
		
		Magic.println("The largest value in your set is "+largest);
		
		Nativefood food;
		food = Nativefood.American;
		
		Magic.println(cuisineif(food));
		food = Nativefood.Indian;
		Magic.println(cuisineif(food));
		
		
		
	}

}
