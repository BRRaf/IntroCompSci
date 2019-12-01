
public class Roulette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Magic.println("Let's play Roulette! Please enter how much money you currently own");
		
		int money = Magic.nextInt();
		
		while (money > 0) {
			
			Magic.println("How much money do you want to bet");
			
			int bet = Magic.nextInt();
			
			if (bet > money) {
				Magic.println("You don't have enough to make that bet! I'll ask again. ");
				
			}else{ 
				Magic.println("Now that you've bet the money, choose a number between 1 and 36");
				
				int number = Magic.nextInt();
				
				int rado = Magic.random(36);
					
					 while (rado == 0) {
						 rado = Magic.random(36);
					 }
				if (number != rado) {
						money = money - bet;
						Magic.println("The number is "+rado+" Oh no! you have lost! Their goes your money, you now have an amount of " + money + "!");
						
				}else {
					money = bet * 35;
					Magic.println("Horray! you've won! you get 35 times the amount you bet! ");
					
					
					Magic.println("Let's play again!");
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		

	}
		
		
}
