
public class Grade_Calculator {

 double marks;
	void studentGradeCalculator(double marks) {
		if(marks <= 100 && marks >=90) {
			System.out.println("The Grade is A");
		}else if(marks <= 89 && marks >= 80) {
			System.out.println("The Grade is B");
		}else if(marks <= 79 && marks >= 70) {
			System.out.println("The Grade is C");
		}else if(marks <= 69 && marks >= 60) {
			System.out.println("The Grade is D");
		}else if(marks <= 60 && marks >= 40 ) {
			System.out.println("The Grade is F");
		}else {
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		Grade_Calculator gc = new Grade_Calculator();
		gc.studentGradeCalculator(88);
	}
}
