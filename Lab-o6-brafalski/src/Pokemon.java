import java.util.Random;
public class Pokemon {

	private int health;
	private String name;
	private int str;
	private int def;
	private boolean defstat;
	
	public Pokemon(String name) {
		
		Random rand = new Random();
		
		this.name = name;
		str = rand.nextInt(10) + 11;
		def = rand.nextInt(9) + 1;
		health = rand.nextInt(50) + 51;
		this.defstat = false;
		
	}
	
	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	public int getStr() {
		return str;
	}
	public int getDef() {
		return def;
	}
	public boolean getDefstat() {
		return defstat;
	}
	
	
	public String listofAttacks() {
		String list = "1. Defend";
		
		return list;
	}
	
	public PokemonType getType() {
		return PokemonType.glitch;
	}
	
	public int attackAmount(int attackNumber) {
		// Step1 
		if (attackNumber == 0) {
			defstat = true;
			return 0;
			
		} else if (attackNumber == 1) {
		defstat = false;
		return str;
		}
		return 0;
	}
	
	public int damageAmount(int attackStrength, PokemonType attackerType) {
		// Step 3
		return 0;
	}

	public void receiveDamage(int attackStrength, PokemonType attackerType) {
		//Step 2
		int damage = damageAmount(attackStrength, attackerType);
		if (damage <= 0) {
			damage = 0;
		}
		
		
		System.out.println("the damage total is "+damage);
		health -= damage;
		
	}
	

		public void attackPokemon(int attackNumber, Pokemon victim) {
		//Step 4
		victim.receiveDamage(attackAmount(attackNumber), getType()); 
		 if (victim.defstat == true) {
				victim.defstat = false;
			}
		
	}
	public String toString() {
		String rtn = (getName()+": is a "+getType()+" type, has "+health+" hp, has "+str+" strength and has "+def+" defense.");
		return rtn;
	}
}
