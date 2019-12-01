
public class FirePokemon extends Pokemon {
	
	private int health;
	private String name;
	private int str;
	private int def;
	private boolean defstat;
	
	public FirePokemon(String name) {
		super(name);
	}
	
	public String listofAttacks() {
		String list = "1. Defend, 2. Flare";
		return list;
	}
	
	public PokemonType getType() {
		return PokemonType.fire;
	}
	
	public int attackAmount(int attackNumber) {
		
		if (attackNumber == 1) {
			defstat = true;
			return 0;
			
		}else {
			
			return getStr();
		}
		
		
	}
	
	
	public int damageAmount(int attackStrength, PokemonType attackerType) {
		System.out.println(attackStrength);
		if (attackStrength == 0) {
			return 0;
		}
		
		
		if (defstat == true) {
			
			attackStrength /= 2;
		}
		
		
		if (attackerType == PokemonType.grass || attackerType == PokemonType.rock) {
			System.out.println("The attack totals to "+ (attackStrength - getDef()));
			return attackStrength - getDef();
		} else if (attackerType == PokemonType.fire) {
			System.out.println("The attack totals to "+ (attackStrength - getDef()));
			return (attackStrength/2) - getDef();
		} else {
			System.out.println("The attack totals to "+ (attackStrength - getDef()));
			return (attackStrength*2) - getDef();
		}
		

		
	}
	
	
	
	
	
	
}
