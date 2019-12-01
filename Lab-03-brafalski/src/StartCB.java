// Created by Ben Rafalski with help from Professor Block's Magic.java to make a checkerboard of two colors and creating an anagram machine
public class StartCB { 





	public static void checker(int x, int y, final int num, int size, String color1, String color2) {

		int og = num;
		int row = 20;
		String color = color1;




		while (row != 0) {


			if (color == color1) {
				Magic.drawRectangle(x, y, size, size, color1);
				x += size;
				color = color2;
			}
			else if (color == color2) {
				Magic.drawRectangle(x, y, size, size, color2);
				x += size;
				color = color1;
			}



			og -= 1;


			if (og == 0) {

				x = 0;
				y = y + size;
				og = num;
				row -= 1;
				if (color == color1) {
					color = color2;

				}else if (color == color2) {
					color = color1;
				}
			}

		}

	}





	public static void Palindrome(String word, String Palindrome) {
			
		
			
			if (Palindrome == "") {
				Palindrome = word;
			}
			
			if (word.length() <= 0) {
				Magic.println(Palindrome);
				return;
			}
			char ch = word.charAt(word.length() - 1);
			Palindrome += ch;
			
			
			word = word.substring(0,(word.length()-1));
			
			Palindrome(word, Palindrome);
		


	}


	public static void anagram(String possibleBackLetters, String alreadyKnownFrontWord) {

		String word = possibleBackLetters;

		if (word.length() <= 1) {
			Magic.println(alreadyKnownFrontWord+possibleBackLetters);
			return;
		}

		for (int i = 0; i < word.length(); i++) {

			
			String remainingPossibleBackLetters;
			char ch = word.charAt(i);
			if (i == 0) {
				remainingPossibleBackLetters = word.substring(1,(word.length()));
			}else if(i == (word.length()-1)) {
				remainingPossibleBackLetters = word.substring(0 , (word.length() - 1));
			}else {
				remainingPossibleBackLetters = word.substring(0,(i))+word.substring((i +1), (word.length()));
			}

			String localKnownFrontWord = alreadyKnownFrontWord + ch;
			anagram(remainingPossibleBackLetters, localKnownFrontWord);
		}





	}
















	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Magic.drawEmptyRectangle(200, 200, 100, 100, "red");

		Magic.drawLine(300, 200, 310, 195, "red");

		Magic.drawLine(300, 300, 310, 295, "red");

		Magic.drawLine(310, 195, 310, 295, "red");

		Magic.drawLine(310, 195, 210, 195, "red");

		Magic.drawLine(200, 200, 210, 195, "red");

		int x = 0;

		Magic.setImage1("ghost.jpg");
		Magic.setPosForImage1(100, 100);

		Magic.setPosForImage1(300, 300);
		Magic.updateImages();

		while (x != 500) {

			Magic.setPosForImage1(x, 300);
			Magic.updateImages();
			x = x+1;

			Magic.wait(2);


		}

		Magic.setImage2("pumpkin.jpg");
		Magic.setPosForImage2(700, 800);

		Magic.setImage3("Sans_sprite.jpg");
		Magic.setPosForImage3(200, 800);




		checker(0, 0, 6, 100, "red", "blue");

	
		Magic.println("please enter a String");

		String word = Magic.nextLine();


		Palindrome(word,"");

		Magic.println("please enter a String");

		 

		word = Magic.nextLine();



		anagram(word, "");

	}

}
