import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LitersConverterTest {

	@Test
	void Measurecheck1() throws LitersException {
		
		try {
			LitersConverter.StringSplitSpace("12.5 cl");
		} catch (LitersException e) {		
			fail(" That was the correct measurement, Not supposed to fail here");
	}
		
	}
	
	@Test
	void Measurecheck2() throws LitersException {
		
		try {
			LitersConverter.StringSplitSpace("12.5 mo");
			fail(" Incorrect measurement, not supposed to succeed");
		} catch (LitersException e) {		
			
	}
		
	}
	
	@Test
	void Measurecheck3() throws LitersException {
		
		try {
			LitersConverter.StringSplitSpace("12.5ml");
			;
		} catch (LitersException e) {		
			fail(" That was the correct measurement, Not supposed to fail here");
	}
		
	}
	
	@Test
	void Measurecheck4() throws LitersException {
		
		try {
			LitersConverter.StringSplitSpace("12.5mo");
			fail(" Incorrect measurement, not supposed to succeed");
		} catch (LitersException e) {		
			
	}
		
	}
	

}
