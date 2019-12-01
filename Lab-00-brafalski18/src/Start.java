
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Magic.println("Hello World");
		
		int puppies = 10;
		Magic.println(puppies);
		
		Magic.println("Hahahahahaha");
		Magic.println("I can take over the world!");
		Magic.println("I can hack into any system");
		Magic.println("I now know everything about you!");
		Magic.println("Please enter a bunch of random numbers");
		
		int storage = Magic.nextInt();
		
		Magic.println(storage);
		
	  int chicken = Magic.nextInt();
		int weight = Magic.nextInt();
		int favnum = Magic.nextInt();
	
		Magic.println(chicken);
		Magic.println(weight);
		Magic.println(favnum);
		
		Magic.drawOval(200, 300, 30, 60, "blue");
		
		Magic.drawOval(0, 0, 200, 40, "magenta");
		Magic.drawOval(200, 100, 500, 4000, "cyan");
		Magic.drawOval(500, 5, 10, 50, "red");
		Magic.drawOval(600, 500, 300, 500, "green");
		
		Magic.drawLine(50, 90, 300, 450, "Blue");
		Magic.drawLine(100, 50, 20, 70, "green");
		Magic.drawLine(250, 200, 250, 600, "red");
		Magic.drawLine(800, 50, 700, 0, "magenta");
		
		
		Magic.println("We are going to draw a Rectangle! Please Enter an X value!");
		
		int x = Magic.nextInt();
		
		Magic.println("Now enter a Y value!");
		
		int y = Magic.nextInt();
		
		Magic.println("Now enter the Height!");
		
		int height = Magic.nextInt();
		
		Magic.println("Now enter the Width!");
		
		int width = Magic.nextInt();
		
		Magic.drawRectangle(x, y, width, height, "darkGrey");		
		
	}

}
