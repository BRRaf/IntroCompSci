import java.util.Scanner;
public class PokemonMain {

	public static int attackchoice(int turn, String name) {
		// used to allow the player to choose an attack. it's easier to access as a method in the main.
		Scanner scan = new Scanner(System.in);
		if (turn == 1) {
			System.out.println("Player 1; what attack will "+ name + " perform?");
			
		}else {
			System.out.println("Player 2); what attack will "+ name + " perform?");
		}
		
		int attack = 0;
		while (attack < 1 || attack > 4 ) {
		System.out.println("Please choose an attack using the cooresponding number");
		System.out.println("Flare[1]");
		System.out.println("Bubble[2]");
		System.out.println("Grass Slice[3]");
		System.out.println("Rock[4]");
		
		attack = scan.nextInt();
		
		if (attack >= 1 && attack <= 4) {
			return attack;
		} else {
			System.out.println("That is not an avaliable choice.");
		}
		
		}
		return attack;
		
		
		
	}
	
	
	public static void win(String name, int hp) {
		// simple endgame code. nothing special.
		System.out.println(name+" is victorious! "+name+" had only "+hp+" hp left!");
		System.exit(0);
	}
	
	
	
	
	
	public static CreateaPoke setup(int player) {
		// had no point to being a method in the Create a Poke class, although it might have been easier to program if it were.
		Scanner scan = new Scanner(System.in);
		if (player == 1) {
			
			System.out.println("Welcome to the world of Pokemon!");
			System.out.println("Player 1: Please enter the name of your Pokemon!");
		} else {
			System.out.println("Player 2: Please enter the name of your Pokemon!");
		}
			String name = scan.nextLine();
			
			System.out.println("What is "+name+"'s type? fire, water, grass or rock?");
			
			String nextType;
			CreateaPoke.PokeTypes type = CreateaPoke.PokeTypes.fire;
			
			
			int check = 0;
			
			// I have if-else statements instead of switch statements because I don't how to have a variable equal user chosen enums.
			// This is the main reason this is in the main class, as this would be the same no matter which class it went into.
			
			while(check == 0) {
				nextType = scan.nextLine();
			if (nextType.equals("fire")) {
				type = CreateaPoke.PokeTypes.fire;
				check = 1;
			} else if (nextType.equals("grass")) {
				type = CreateaPoke.PokeTypes.grass;
				check = 1;
			} else if (nextType.equals("water")) {
				type = CreateaPoke.PokeTypes.water;
				check = 1;
			} else if (nextType.equals("rock")) {
				type = CreateaPoke.PokeTypes.rock;
				check = 1;
			} else {
				System.out.println("Those arn't the options. Type in a correct type.");
				check = 0;
			}
			
			
			}
			
		if (player == 1) {
			CreateaPoke poke1 = new CreateaPoke(type, name);
			System.out.println(poke1.toString());
			return poke1;
		} else {
			CreateaPoke poke2 = new CreateaPoke(type, name);
			System.out.println(poke2.toString());
			return poke2;
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CreateaPoke poke1 = setup(1);
	CreateaPoke poke2 = setup(2);
	int turn = 1;
	int attacktype = 0; // the player's choice in what attack they want to use, which has a corresponding type.
	int atnum; // the number of hitpoints that subtracts from the pokemon's hitpoints, I couldn't come up with a good name.
	
	
	while (poke1.getHp() > 0 || poke2.getHp() > 0) {
		
		if (turn == 1) {
			attacktype = attackchoice(turn, poke1.getName());
			atnum = poke1.getAttack(attacktype, poke1.convertType(poke1.getType()), poke2.convertType(poke2.getType()) );
			poke2.setHp(atnum);
			System.out.println(poke2.hpString(atnum));
			if (poke2.getHp() <= 0) {
				win(poke1.getName(), poke1.getHp());
			} else {
				turn = 2;
			}
		} if (turn == 2) {
			attacktype = attackchoice(turn, poke2.getName());
			atnum = poke2.getAttack(attacktype, poke2.convertType(poke2.getType()), poke1.convertType(poke1.getType()) );
			poke1.setHp(atnum);
			System.out.println(poke1.hpString(atnum));
			if (poke1.getHp() <= 0) {
				win(poke2.getName(), poke2.getHp());
			} else {
				turn = 1;
		}
		
		
		
	}
		
		
		
	}
	}
}
