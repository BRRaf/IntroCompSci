import java.util.ArrayList;


public class BuildingBlocks {
	public static void main(String[] args){

		
		// Question 1. 
		/* Using the code below as a guide make an ArrayList of four Double values and 
		 * then create print out the values using a for loop. 
		 */
		
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(5);
		myArray.add(3);
		myArray.add(-10);
		
		for(int i =0;i<myArray.size();i++){
			System.out.println("The value at index "+i+" is "+myArray.get(i));
		}
		
		ArrayList<Double> Array2 = new ArrayList<Double>();
		Array2.add(2.5);
		Array2.add(22.2);
		Array2.add(1.99);
		Array2.add(6.34);
		
		for(int j = 0; j<Array2.size(); j++) {
			System.out.println("The value at index "+j+" is "+Array2.get(j));
		}
		
		//Question 2
		/* Using the code below as a guide make a 2D ArrayList of 4 x 5 Doubles
		 */
		
		ArrayList<ArrayList<Integer>> my2DArray = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> rowOne = new ArrayList<Integer>();
		rowOne.add(5);
		rowOne.add(7);
		rowOne.add(-10);
		
		ArrayList<Integer> rowTwo = new ArrayList<Integer>();
		rowTwo.add(-15);
		rowTwo.add(22);
		rowTwo.add(33);
		
		my2DArray.add(rowOne);
		my2DArray.add(rowTwo);
		
		for(int row = 0; row < my2DArray.size(); row++){
			ArrayList<Integer> aRow = my2DArray.get(row);
			for(int col = 0; col < aRow.size();col++){
				Integer anElement = aRow.get(col);
				System.out.println("The element at "+row+", "+col+" is "+anElement);
			}
		}
		
		ArrayList<ArrayList<Double>> Array = new ArrayList<ArrayList<Double>>();
		
		ArrayList<Double> row1 = new ArrayList<Double>();
		row1.add(1.75);
		row1.add(5.44);
		row1.add(8.36);
		row1.add(12.12);
		row1.add(7.1);
		
		ArrayList<Double> row2 = new ArrayList<Double>();
		row2.add(1.75);
		row2.add(5.44);
		row2.add(8.36);
		row2.add(12.12);
		row2.add(7.18);
		
		ArrayList<Double> row3 = new ArrayList<Double>();
		row3.add(1.75);
		row3.add(5.44);
		row3.add(8.36);
		row3.add(12.12);
		row3.add(3.54);
		
		ArrayList<Double> row4 = new ArrayList<Double>();
		row4.add(.54);
		row4.add(5.44);
		row4.add(8.36);
		row4.add(12.12);
		row4.add(7.15);
		
		Array.add(row1);
		Array.add(row2);
		
		
		
		
		Controller c = new Controller();
		
		//Question 3 
		/* Expand the associated files so that we can move the circle up, down, left, or right 
		 * 
		 */

		//Question 4
		/* Add another shape that can be controlled by another four up, down, left, right buttons 
		 * 
		 */

	}
}
