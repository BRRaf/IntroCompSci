import static org.junit.Assert.*;

import org.junit.Test;


public class BuildingBlocksTest {

	//Question 1. 
	/* Copy the following code and change it so you provide three different test values
	 */
	@Test
	public void testProductSimple() {
		if(BuildingBlocks.product(1, 1, 1)!=1){
			fail("1*1*1 does not equal 1 for some reason");
		} 
		if (BuildingBlocks.product(2, 3, 4)!=24){
			fail("2*3*4 does not equal 24 for some reason");
		}
		
		if (BuildingBlocks.product(0, 99, 500)!=0){
			fail("0*99*500does not equal 0 for some reason");
		}  
	}
	
	@Test
	public void testProductSimple2() {
		if(BuildingBlocks.product(2, 8, 4)!=64){
			fail("2*8*4 does not equal 64 for some reason");
		} 
		if (BuildingBlocks.product(0, 1, 800)!=0){
			fail("0*1*800 does not equal 0 for some reason");
		}
		
		if (BuildingBlocks.product(27, 929, 132)!=3310956){
			fail("27*929*132does not equal 3,310,956 for some reason");
		}  
	}
	
	//Question 2
	/* Copy the following code and change it so you provide three different test values
	 */
	@Test
	public void testProductWithAssert() {
		assertTrue("1*1*1 does not equal 1 for some reason",BuildingBlocks.product(1, 1, 1)==1);
		assertTrue("2*3*4 does not equal 24 for some reason",BuildingBlocks.product(2, 3, 4)==24);
		assertTrue("0*99*500does not equal 0 for some reason",BuildingBlocks.product(0, 99, 500)==0);
	}
	
	@Test
	public void testProductWithAssert2() {
		assertTrue("2*4*6 does not equal 48 for some reason",BuildingBlocks.product(2, 4, 6)==48);
		assertTrue("20*3*66 does not equal 3960 for some reason",BuildingBlocks.product(20, 3, 66)==3960);
		assertTrue("850*320*141 does not equal 11,152,000 for some reason",BuildingBlocks.product(20, 40, 60)==480);
	}
	
	//Question 3
	/* Modify the following code so that you use a value different than 10 
	 */
	@Test
	public void testAverage() {
		int data[] = new int[5];
		data[0] = 3;
		data[1] = 3;
		data[2] = 3;
		data[3] = 3;
		data[4] = 3;
		assertTrue("Cannot average 5 of same number", BuildingBlocks.average(data)==3);
	}	
	
	//Question 4 
	/* Copy the testAverage above and create a new test that has a different size array and uses
	 * different values (so, not just 5 of the same number but perhaps 7 of different numbers)
	 *  
	 */
	@Test
	public void testAverage2() {
		int data[] = new int[7];
		data[0] = 3;
		data[1] = 6;
		data[2] = 7;
		data[3] = 2;
		data[4] = 15;
		data[5] = 5;
		data[6] = 200;

		assertTrue("Cannot average the seven different numbers", BuildingBlocks.average(data)==34);
	}	
	
	
	
	
	
	//Question 5
	/* Copy the testAverage above and create a test where the array is empty
	 * If there is a bug in BuiildingBlocks.average, fix that method. 
	 */
	@Test
	public void testAverage3() {
		int data[] = new int[0];
		

		assertTrue("Cannot average a list with nothing in it.", BuildingBlocks.average(data)==0);
	}	
	
	
	
}

