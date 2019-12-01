import java.util.Scanner;

public class StartCBA {
	
	public static void win(String name, int hp) {
		// simple endgame code. nothing special.
		System.out.println(name+" is victorious! "+name+" had only "+hp+" hp left!");
		System.exit(0);
	}

	public static Pokemon setup1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Player 1: please name your pokemon");
		
		String name1 = scan.nextLine();
		
		System.out.println("Player 1: please choose your pokemon type:");
		
		String type1 = scan.nextLine();
		
		
		Pokemon poke1 = new Pokemon(name1);
		
		if (type1.equals("fire")) {
			 poke1 = new FirePokemon(name1);
			System.out.println(poke1.toString());
		} else if (type1.equals("water")) {
			 poke1 = new WaterPokemon(name1);
			System.out.println(poke1.toString());
		} else if (type1.equals("grass")) {
			 poke1 = new GrassPokemon(name1);
			System.out.println(poke1.toString());
		} else if (type1.equals("rock")) {
			 poke1 = new RockPokemon(name1);
			System.out.println(poke1.toString());
		} 
		
		return poke1;
	}
	
	public static Pokemon setup2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Player 2: please name your pokemon");
		
		String name = scan.nextLine();
		
		System.out.println("Player 2: please choose your pokemon type:");
		
		String type = scan.nextLine();
		
		
		Pokemon poke2 = new Pokemon(name);
		
		if (type.equals("fire")) {
			 poke2 = new FirePokemon(name);
			System.out.println(poke2.toString());
		}  else if (type.equals("water")) {
			 poke2 = new WaterPokemon(name);
			System.out.println(poke2.toString());
		} else if (type.equals("grass")) {
			 poke2 = new GrassPokemon(name);
			System.out.println(poke2.toString());
		} else if (type.equals("rock")) {
			 poke2 = new RockPokemon(name);
			System.out.println(poke2.toString());
		} 
		
		return poke2;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		Pokemon poke1 = setup1();
		
		Pokemon poke2 = setup2();
		
		
		
		int turn = 1;
		int atchoice = 0;
		
	
		
		
		
		while (poke1.getHealth() > 0 || poke2.getHealth() > 0) {
			
			if (turn == 1) {
				
				System.out.println("Player 1: Please choose an attack by entering a cooresponding number from the following list:");
				System.out.println(poke1.listofAttacks());
				
				atchoice = scan.nextInt();
				poke1.attackPokemon(atchoice, poke2);
				System.out.println(poke2.toString());
				turn = 2;
				
				if (poke2.getHealth() <= 0) {
					win(poke1.getName(), poke1.getHealth() );
				}
				
				}
			if (turn == 2) {
				
				System.out.println("Player 2: Please choose an attack by entering a cooresponding number from the following list:");
				System.out.println(poke2.listofAttacks());
				
				atchoice = scan.nextInt();
				poke2.attackPokemon(atchoice, poke1);
				System.out.println(poke1.toString());
				turn = 1;
				
				if (poke2.getHealth() <= 0) {
					win(poke1.getName(), poke1.getHealth() );
				}
			
			
			}
		
		
		
			
		}	
		
		
	}
	
	
}
