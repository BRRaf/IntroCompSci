import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LunarCalanderTest {

	@Test
	public void MonthTest() throws LunarException {
		try {
			LunarCalander.monthCheck(5);
		} catch (LunarException e) {
		fail("Not supposed to fail here");
		}
	}

	
	@Test
	public void MonthTest2() throws LunarException {
		try {
			LunarCalander.monthCheck(-5);
			fail("Not supposed to succeed here");
		} catch (LunarException e) {
		
		}
	}
	
	@Test
	public void DateTest() throws LunarException {
		try {
			LunarCalander.dateCheck(3, 22);
		} catch (LunarException e) {
		fail("Not supposed to fail here");
		}
	}
	
	@Test
	public void DateTest2() throws LunarException {
		try {
			LunarCalander.dateCheck(3,-55);
			fail("Not supposed to succeed here");
		} catch (LunarException e) {
		
		}
	}
	
	@Test
	public void YearTest() throws LunarException {
		try {
			LunarCalander.checkYear(5, 5, 2001);
		} catch (LunarException e) {
		fail("Not supposed to fail here");
		}
	}
	
	@Test
	public void YearTest2() throws LunarException {
		try {
			LunarCalander.checkYear(5, 5, -2005);
			fail("Not supposed to succeed here");
		} catch (LunarException e) {
		
		}
	}
	
	
	
	
}
