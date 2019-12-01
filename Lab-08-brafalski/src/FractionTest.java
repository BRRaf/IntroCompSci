import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTest {

	@Test
	public void TestFraction() throws DivideByZerio {
		try {
			Fraction frac = new Fraction(1,2);
		} catch(DivideByZerio e){
		fail("Not supposed to fail here");
	}
	}
	
	@Test
	public void TestFraction2() throws DivideByZerio {
		try {
			Fraction frac = new Fraction(2,0);
			fail("Not supposed to continue");
		} catch(DivideByZerio e) {
			
		}
		
		
	}
}
