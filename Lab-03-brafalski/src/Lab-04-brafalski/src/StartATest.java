import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StartATest {

	@Test
	public void SwappysortTestempty() {
		
		int[] testorig = new int[5];
		
		int[] testcopy = StartA.Swappysort(testorig);
		
		for (int i = 0; i > testcopy.length; i++) {
			if (testcopy[i] > 0);
				fail("There is an element in an empty swapsort list.");
			
		}
		
		
	}



	@Test
	public void SwappysortTest1() {
	
	int[] testorig = new int[1];
	
	testorig[0] = 5;
	
	int[] testcopy = StartA.Swappysort(testorig);
	
	
	
	for (int i = 0; i > testcopy.length; i++) {
		if (testcopy[i] != testcopy[i]);
			fail("The list with only one element has changed somehow.");
		
	}
	
	
}
	
	
	@Test
	public void SwappysortTest2() {
	
	int[] testorig = new int[5];
	
	testorig[0] = 1;
	testorig[1] = 2;
	testorig[2] = 3;
	testorig[3] = 4;
	testorig[4] = 5;
	
	int[] testcopy = StartA.Swappysort(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
		if (testcopy[i] >= testcopy[i + 1]) {
			fail("The list, which was already in the correct order, has changed it's order");
			
	
	}
	}
	}
	
	@Test
	public void SwappysortTest3() {
	
	int[] testorig = new int[5];
	
	testorig[0] = 5;
	testorig[1] = 4;
	testorig[2] = 3;
	testorig[3] = 2;
	testorig[4] = 1;
	
	int[] testcopy = StartA.Swappysort(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] >= testcopy[i + 1]) {
			fail("The list, which was in the opposite order, has has not corrected it's order");
		
	}
	}		
	
}
	
	
	
	@Test
	public void SwappysortTest4() {
	
	int[] testorig = new int[5];
	
	testorig[0] = 5;
	testorig[1] = 2;
	testorig[2] = 3;
	testorig[3] = 4;
	testorig[4] = 1;
	
	int[] testcopy = StartA.Swappysort(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] >= testcopy[i + 1]) {
			fail("The list, which has only one element out of place, has has not corrected it's order");
		
	}
	}		
	
}
	
	
	@Test
	public void PlayingcardTest1() {
	
	int[] testorig = new int[5];
	

	int[] testcopy = StartA.PlayingCard(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] > 0) {
			fail("The list, which has empty, has a value in it.");
		
	}
	}		
	
}
	
	@Test
	public void PlayingcardTest2() {
	
	int[] testorig = new int[1];
	
	testorig[0] = 5;
	int[] testcopy = StartA.PlayingCard(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] != testcopy[i]) {
			fail("The list, which has one element in it, has a different value.");
		
	}
	}		
	
}
	
	@Test
	public void PlayingcardTest3() {
	
	int[] testorig = new int[5];
	
	
	testorig[0] = 0;
	testorig[1] = 1;
	testorig[2] = 2;
	testorig[3] = 3;
	testorig[4] = 4;
	int[] testcopy = StartA.PlayingCard(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] != testcopy[i]) {
			fail("The list, which  is in the correct order, has changed itself.");
		
	}
	}		
	
}
	
	@Test
	public void PlayingcardTest4() {
	
	int[] testorig = new int[5];
	
	testorig[0] = 4;
	testorig[1] = 3;
	testorig[2] = 2;
	testorig[3] = 1;
	testorig[4] = 0;
	int[] testcopy = StartA.PlayingCard(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] >= testcopy[i]) {
			fail("The list, which is an incorrect order, has not corrected itself.");
		
	}
	}		
	
}
	
	@Test
	public void PlayingcardTest5() {
	
	int[] testorig = new int[5];
	
	testorig[0] = 5;
	testorig[1] = 1;
	testorig[2] = 2;
	testorig[3] = 3;
	testorig[4] = 0;
	int[] testcopy = StartA.PlayingCard(testorig);
	
	
	
	for (int i = 0; i > testcopy.length - 1; i++) {
	
		if (testcopy[i] >= testcopy[i]) {
			fail("The list, which has one element out of place, has not corrected itself.");
		
	}
	}		
	
}
	
	
	
	
}