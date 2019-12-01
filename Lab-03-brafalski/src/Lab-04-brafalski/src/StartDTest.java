import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StartDTest {

	@Test
	public void KmtoMileTest() {
		if (StartD.KmtoMile(1) != .621) {
			fail("1 km doesn't equal .621");
		}
		if (StartD.KmtoMile(2.5) != 1.553) {
			fail("2.5 km doesn't equal 1.553");
		}
		if (StartD.KmtoMile(1253.221) != 778.715) {
			fail("1253.221 km doesn't equal .778.715");
		}
	}

	
	
	@Test
	public void optionsTest() {
		int[] check = StartD.options(-5);
		if (check.length < 0 ) {
			fail ("The list contains less than 0");
		}
		check = StartD.options(0);
		if (check[0] != 0) {
			fail ("The list with a parameter of zero does not contain 0. ");
	}
		check = StartD.options(5);
		if (check[5] != 4) {
			fail ("The list with 5 elements does not end in 4.");
		}
				
	}
	
	@Test
	public void MethodTest() {
		
		int list[] = new int[5];
		list[0] = 0;
		list[1] = 0;
		list[2] = 0;
		list[3] = 0;
		list[4] = 0;
		
		int largest = StartD.B(list);
		
		if (largest != 0) {
			fail("The largest in a set of 0 is not 0");
		}
		
		list[0] = 0;
		list[1] = 1;
		list[2] = 2;
		list[3] = 3;
		list[4] = 4;
		
		largest = StartD.B(list);
		
		if (largest != 4) {
			fail("The largest in a fixed set of integers is not 4");
		}
		
		list[0] = 55;
		list[1] = 73;
		list[2] = 200;
		list[3] = 31;
		list[4] = 11;
		
		largest = StartD.B(list);
		
		if (largest != 200) {
			fail("The largest in a fixed set of integers is not 200");
		}
		
	
		
		
	}
	

		@Test
		public void averageTest() {
			
			int[] list = new int[3];
			
			list[0] = 1;
			list[1] = 2;
			list[4] = 4;
			
			double avg = StartD.avg(list);
			
			if (avg >= 2.33334 || avg <= 2.33332) {
				
				fail("The average of 1 2 and 4 is incorrect.");
				
			}
			
			// It's difficult to create tests for drawing programs because it would have to visually check every pixel to check if it's all in place
			// check for a specific pixel placements at the corners of the drawing to verify that the drawing is in the correct spot or is the correct shape.
			
			
		}
		
		
	}
	
	

