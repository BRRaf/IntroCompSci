import java.util.Random;
public class CreateaPoke {

	private PokeTypes type;
	private int hp;
	private int str;
	private int def;
	private String name;
	
	// The enum is in this class for ease of access. made so that it can be compared to user choice later. 
	public enum PokeTypes {
		fire,water,rock,grass
	}

	
	
	public CreateaPoke(PokeTypes type, String name) {
		
		Random rand = new Random();
		
		this.name = name;
		this.type = type;
		this.hp = rand.nextInt(50) + 51;
		this.str = rand.nextInt(10) + 11;
		this.def = rand.nextInt(9) + 1;
	}

	public PokeTypes getType() {
		return type;
	}
	
	// this was made so i could compare an int to an int  instead of an int to a string/ennum.
	public int convertType(PokeTypes type) {
		int numtype = 0;
		
		switch(type) {
		case fire:
			numtype = 1;
			break;
		case water:
			numtype = 2;
			break;
		case grass:
			numtype = 3;
			break;
		case rock:
			numtype = 4;
			break;
		default:
			numtype = 0;
			
			System.out.println("ERROR");
			
		} 
		
		return numtype;
		
	}
	
	
	

	public int getHp() {
		return hp;
	}
	
	// hp changer using a set number.
	public void setHp( int attack) {
		hp -= attack;
	}

	public int getStr() {
		return str;
	}

	public int getDef() {
		return def;
	}
	
	public String getName() {
		return name;
	}
	
	// compares the type of the attack to the types of the pokemon to calculate the amount of hitpoints to subtract from the opponent.
	public int getAttack(int attacktype, int selftype, int numtype) {
		int attack = str;
		if(attacktype != selftype) {
			attack = attack/2;
		} if((attacktype == 1 && numtype == 3) || (attacktype == 2 && numtype == 1) || (attacktype == 3 && numtype == 4) || (attacktype == 1 && numtype == 3)) {
			attack = attack*2;
		}
		return attack;
	}
	
	
	// regular toString to print basic info
	public String toString() {
		String rtn = (name+": is a "+type+" type, has "+hp+" hp, has "+str+" strength and has "+def+" defense.");
		return rtn;
	}
	// toString to print the amount of hp that was taken and total hp left.
	public String hpString(int atnum) {
		String rtn = (name+" has lost "+atnum+" hp and now has "+hp+" hp left.");
		return rtn;
	}
}
