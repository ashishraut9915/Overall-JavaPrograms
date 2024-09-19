package Arithmatic_Operations;

public class Company {

	
	int add(int num1, int num2) {
		
		int sum = num1 + num2 ;
		System.out.println("Sum is = "+sum);
		return sum;
	}
	
	
	void avg(int num1, int num2) {
	
		Company c = new Company();
		int sum = c.add(num1,num2);
		int average = sum / 2;
		System.out.println("Average is = "+average);
		
	}
	

	public static void main(String[] args) {
		
		Company cc = new Company();
		//cc.add(75, 15);
		//Company c1 = new Company();
		cc.avg(45,45);
		
	}

}
