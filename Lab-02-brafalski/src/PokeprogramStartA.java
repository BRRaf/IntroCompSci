
public class PokeprogramStartA {
	
	public static int Weak(int strength) {
		int hchange = -(strength*2);
		return hchange;
	}
	
	public static int Strong(int strength) {
		int hchange = -(strength*4);
		return hchange;
	}
	
	public static int Heal(int strength) {
		double hchange = strength*1.5;	
		return (int) hchange;		
	}
	
	
	
	
	
	
	public static int Turn(double a, double b) {
		
		
		
		double set = 0;
		int turn = 0;
		int chance = Magic.random(100);
		
		if (a >= b) {
			set = ((a/(a+b))*100);
			
			if (chance < set) {
				turn = 1;
				Magic.println("Player1's turn.");
			}else {
				turn = 2;
				Magic.println("Player2's turn");
			}
			
		} else {
			set = (b/(a+b))*100;
			
			if (chance < set) {
				turn = 2;
				Magic.println("Player2's turn");
						
			}else {
				turn = 1;
				Magic.println("Player1's turn");
			}
		}
		return turn;
	}
	
	
	
	
	
	public static int Move(int strength, String name) {
		int chealth = 0;
		Magic.println("It is currently "+name+"'s turn, should they do a Weak Attack[w], a Strong Attack[s] or Heal[h]");
		String choice = Magic.nextLine();
		
		if (choice.equalsIgnoreCase("w")) {
			chealth = Weak(strength);
		}else if(choice.equalsIgnoreCase("s")) {
			chealth = Strong(strength);
		}else if(choice.equalsIgnoreCase("h")) {
				chealth = Heal(strength);
			
			}else {
				Magic.println("That's not an option, please enter the following options");
				Move(strength,name);
		}return chealth;
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Magic.println("Enter the name for Player One's Pokemon:");
		String name1 = Magic.nextLine();
		
		int health1 = 0;
		while (health1 < 20) {
			health1 = Magic.random(100);
		}
		
		int strength1  = 0;
		while (strength1 < 1) {
			strength1 = Magic.random(8);
		}
		
		double speed1 = 0;
		while (speed1 < 1) {
			speed1 = Magic.random(100);
		}
		
		Magic.println(name1+"'s health is "+health1+", their strength is "+strength1+", and their speed is "+speed1+".");
		
		Magic.println("Enter the name for Player Two's Pokemon:");
		String name2 = Magic.nextLine();
		
		int health2 = 0;
		while (health2 < 20) {
			health2 = Magic.random(100);
		}
		
		int strength2  = 0;
		while (strength2 < 1) {
			strength2 = Magic.random(8);
		}
		
		double speed2 = 0;
		while (speed2 < 1) {
			speed2 = Magic.random(100);
		}
		
		Magic.println(name2+"'s health is "+health2+" , their strength is "+strength2+", and their speed is "+speed2+".");
		
		
		
		
		
		int hchange = 0;
		while (health1 > 0 && health2 > 0) {
			
			int turn = Turn(speed1, speed2);
			
			if (turn == 1) {
				hchange = Move(strength1, name1);
					if (hchange > 0) {
						health1 = health1 + hchange;
						Magic.println(name1+" has healed themselves and now has "+health1+" hp left.");
						
					}else {
						health2 = health2 + hchange;
						Magic.println(name1+" has harmed "+name2+", "+name2+" now has "+health2+" hp left.");
					}
				if (health2 > 0) {
					
				hchange = Move( strength2, name2);	
					if (hchange > 0) {
					health2 =  health2 + hchange;
					Magic.println(name2+" has healed themselves and now has "+health2+" hp left.");
					}else {
					health1 = health1 + hchange;
				}	Magic.println(name2+" has harmed "+name1+", "+name1+" now has "+health1+" hp left.");
				}	
			}
			if (turn == 2) {
				hchange = Move( strength2, name2);
					if (hchange > 0) {
						health2 = health2 + hchange;
						Magic.println(name2+" has healed themselves and now has "+health2 +" hp left.");
					}else {
						health1 = health1 + hchange;
						Magic.println(name2+" has harmed "+name1+", "+name1+" now has "+health1+" hp left.");
					}
				if (health1 > 0) {
					
				hchange = Move(strength1, name1);	
					if (hchange > 0) {
					health1 = health1 + hchange;
					Magic.println(name1+" has healed themselves and now has "+health1+" hp left.");
					}else {
					health2 = health2 + hchange;
					Magic.println(name1+" has harmed "+name2+", "+name2+" now has "+health2+" hp left.");
				}
			}	
			}
			
			
		}
		
		if (health2 <= 0) {
			Magic.println(name1+" has triumphed! their remaining health was "+health1+" hp.");
		}
		if (health1 <= 0) {
			Magic.println(name2+" has triumphed! their remaining health was "+health2+" hp,");
		}
		
		Magic.println("end");
		
		
		
		
		
	}

}
