package entities;

public class Student {

	public String name;
	public double grade1, grade2, grade3;
	
	public void studentSituation() {
		double finalGrade = grade1 + grade2 + grade3;
		if (finalGrade >= 60) {
			System.out.printf("FINAL GRADE: %.2f%n", finalGrade);
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE: %.2f%n", finalGrade);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", (60 - finalGrade));
		}
	}
}
