import java.util.Arrays;

import javax.swing.JOptionPane;

public class U1L10GradeCalculator {

	public static void main(String[] args) {
		//Ask for # of grades for array size
		int listLength = 0;
		int grade = 0;
		int total = 0;
		int average = 0;
		String lettergrade = "catnapplz";
		int newAverage = 0;
		String newLettergrade = "shuteye";
		int lowestgrade = 100;
		do {
			String input = JOptionPane.showInputDialog("How many grades do you have?: ");
			listLength = Integer.parseInt(input);
		}while (listLength < 1);
		int [] grades = new int [listLength];
		for (int i = 0; i < grades.length; i++) {
			do{
				String input = JOptionPane.showInputDialog("What is your #" + (i + 1) + ": ");
				grade = Integer.parseInt(input);
			}while(grade < 0);
			total +=  grade;
			grades[i] = grade;
		}
		//Calc. the average (all)
		average = total / grades.length;
		//Find Letter
		lettergrade = letter (average);
		//Determine the lowest score (all)
		for (int i = 0; i < grades.length; i++) {
			if (i < lowestgrade) {
				lowestgrade = i;
			}
		}
		//Calc. the average ( - lowestgrade)
		newAverage = (total - lowestgrade) / (grades.length - 1);
		//Find Letter ( - lowestgrade)
		newLettergrade = letter (newAverage);
		
		System.out.println("Grade List Given: " + Arrays.toString(grades));
		System.out.println("Your current grade is " + average + " out of 100. Which means your "
				+ "letter grade is " + lettergrade);
		System.out.println("If you get rid of the " + lowestgrade + " out of 100. Your average"
				+ " grade is " + newAverage + " and your letter grade is " + newLettergrade);
	}
	public static String letter(int average) {
		String letter = "tired";
		if (average > 93) {
			letter = "A";
		}else if (average > 90) {
			letter = "A-";
		}else if (average > 87) {
			letter = "B+";
		}else if (average > 83) {
			letter = "B+";
		}else if (average > 80) {
			letter = "B-";
		}else if (average > 77) {
			letter = "C+";
		}else if (average > 73) {
			letter = "C";
		}else if (average > 70) {
			letter = "C-";
		}else if (average > 67) {
			letter = "D+";
		}else if (average > 63) {
			letter = "D";
		}else if (average > 60) {
			letter = "D-";
		}else {
			letter = "F";		
		}
		return letter;
	}

}
