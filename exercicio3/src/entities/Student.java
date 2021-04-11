package entities;

public class Student {
	public String name;
	public double firstQuarterGrade;
	public double secondQuarterGrade;
	public double thirdQuarterGrade;
	
	public double finalGrade() {
		double sum = firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;
		return sum;
	}
	
}
