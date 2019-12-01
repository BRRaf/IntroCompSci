//Created by Ben Rafalski with help from Professor Block's Magic.java to calculate grade average using methods
public class StartCB {
	// Method 1
	public static double Grades(int testGrade, int labGrade, int participationGrade) {
		
		
		double weightedAvg = ((testGrade * .65) + (labGrade * .30) + (participationGrade * .05));
		
		return weightedAvg;
		
	}
	
	// Method 2
	public static String letter(double number) {
		
		String letgrade = "F";
		
		if (number >= 97) {
			letgrade = "A+";
		}else if (number >= 94) {
			letgrade = "A";
		}else if (number >= 94) {
			letgrade = "A-";
		}else if (number >= 90) {
			letgrade = "B+";
		}else if (number >= 87) {
			letgrade = "B";
		}else if (number >= 84) {
			letgrade = "B-";
		}else if (number >= 80) {
			letgrade = "C+";
		}else if (number >= 77) {
			letgrade = "C";
		}else if (number >= 74) {
			letgrade = "C-";
		}else if (number >= 70) {
			letgrade = "D+";
		}else if (number >= 67) {
			letgrade = "D";
		}else if (number >= 64) {
			letgrade = "D-";
		}else {
			letgrade = "F";
		}
			
		return letgrade;
	}
	
	// Method 3
	public static String calculate(int testGrade, int labGrade, int participationGrade) {
		
		int avg = (int)Grades(testGrade,labGrade,participationGrade);
		
		String let = letter(avg);
		
		return let;
		
	}
	
	// generalized methods:
	
	public static double genGrades(int testGrade, int labGrade, int participationGrade, double wtg, double wlg, double wpg) {
		
		if ((wtg + wpg + wlg) > 100 ) {
			Magic.print("ERROR: GRADES ADD UP PAST 100");
			return 0;
		}else {
		double weightedAvg = ((testGrade * (wtg/100)) + (labGrade * (wlg/100)) + (participationGrade * (wpg/100)));
		
		return weightedAvg;
		}
	}
	
	
	
	public static String gencalculate(int testGrade, int labGrade, int participationGrade, double wtg, double wlg, double wpg) {
		
		int avg = (int)genGrades(testGrade,labGrade,participationGrade,wtg,wlg,wpg);
		
		String let = letter(avg);
		
		return let;}

	







	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int students = -1;
		while (students < 1) {
			Magic.println("Please enter the amount of students that you have.");
			students = Magic.nextInt();
				if (students < 1) {
					Magic.println("Please enter a value 1 or higher");
				}
		}
		
		int[] studentList = new int[students];
		String[] nameList = new String[students];
		int[] testList = new int[students];
		int[] labList = new int[students];
		int[] partList = new int[students];		
		
		
		
		double wtg = 0;
		double wlg = 0;
		double wpg = 0;
		
			while ((wtg + wlg + wpg) != 100) {
				Magic.println("Please enter how much the test grades are worth");
				
				wtg = Magic.nextDouble();
				
				Magic.println("Please enter how much the lab grades are worth");
				
				wlg = Magic.nextDouble();
				
				Magic.println("Please enter how much the participation grades are worth");
				
				wpg = Magic.nextDouble();
				
				if ((wtg + wlg + wpg) != 100) {
					Magic.print("Those numbers don't add to 100, please enter the values again.");
				}
				
			}
		
		
		for (int index = 0; index < studentList.length; index++) {
			
			Magic.println("For student number "+(index + 1)+" Please enter their name.");
			
			nameList[index] = Magic.nextLine();
			
			Magic.println("Please enter the test grade that "+nameList[index]+ " got");
			
			testList[index] = Magic.nextInt();
			
			
			Magic.println("Please enter the lab grade that "+nameList[index]+ " got");
			
			labList[index] = Magic.nextInt();
			
			Magic.println("Please enter the participation grade that "+nameList[index]+ " got");
			
			partList[index] = Magic.nextInt();
			
		}
		
		
		double finalgrade = 0;
		double[] fullgrades = new double[students];
		
		for (int calcindex = 0; calcindex < studentList.length; calcindex++) {
			
		finalgrade = genGrades(testList[calcindex], labList[calcindex], partList[calcindex], wtg, wlg, wpg);	
		
		fullgrades[calcindex] = finalgrade;
		
		String letgrade = gencalculate(testList[calcindex], labList[calcindex], partList[calcindex], wtg, wlg, wpg);
		
		Magic.println(nameList[calcindex]+"'s final grade is "+finalgrade+"% which gets them a letter grade of "+letgrade);
		Magic.println("");
		
		
		}
		
		double sum = 0;
		
		for (int findex = 0; findex < fullgrades.length; findex++ ) {
			
			sum = sum + fullgrades[findex];
		}
		
		double finalavg = (sum/fullgrades.length);
		String finallet = letter(finalavg);
		Magic.println("");
		Magic.println("The average grade of the entire class is "+ finalavg +" which gets them a letter grade of "+finallet);
		
	}

}
