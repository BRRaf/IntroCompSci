import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StartCBTest {

	@Test
	public void moonCalcTest() {
		
			
		
		if (StartCB.calc(1,1,0) == "1/15/1") {
			fail("The final date starting on 1/1/0 is not the 1/15/1");
		}
	
		if (StartCB.calc(12,31,9999) == "1/14/10001") {
			fail("The final date starting on 12/31/9999 is not 1/13/10001");
		}
		
		if (StartCB.calc(9,24,1993) == "10/6/1995") {
			fail("The final date starting on 1/1/0 is not 10/7/1994");
		}
		
	}
	
	
	
	
	}


