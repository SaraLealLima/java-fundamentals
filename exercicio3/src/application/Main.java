package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.firstQuarterGrade = sc.nextDouble();
		student.secondQuarterGrade = sc.nextDouble();
		student.thirdQuarterGrade = sc.nextDouble();
		double finalGrade = student.finalGrade();
		
		if (finalGrade >= 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", finalGrade);
		} else {
			double missing = 60 - finalGrade;
			System.out.printf("FINAL GRADE = %.2f%nFAILED %nMISSING %.2f POINTS", finalGrade, missing);
		}
		
		sc.close();
		
	}

}
