package basics;

public class CheckMarks {
	public static void main(String[] args) {

		gradeStudent(2);

	}// close main

	static void gradeStudent(int score) {
		if (score <= 49) {
			System.out.println("No one gets this grade");
		} // grade "F" <=49
		else if (score >= 50 && score <= 69) {
			System.out.println("Grade D");// grade "D" 50-69
		} // Closes the "50-69" method
		else if (score >= 70 && score <= 79) {
			System.out.println("Grade C");// grade "C" 70-79
		} // Closes the "70-79" method
		else if (score >= 80 && score <= 89) {
			System.out.println("Grade B");// grade "B" 80-89
		} // Closes the "80-89" method
		else if (score >= 90 && score <= 100) {
			System.out.println("Grade A");// grade "A" 90-100
		} // Closes the "90-100" method
	}// Closes the "gradeStudent" method
}// Closes the class
