package if_else_ProgramTask;

public class LargestNumber {

	
	void findLargestNumber(int num1, int num2) {
		if(num1 < num2 && num2 > num1) {
			System.out.println("Num2 is Largest...!!!");
		}else if(num2 < num1 && num1 > num2) {
			System.out.println("Num1 is Largest...!!!");
		}else {
			System.out.println("Both are Equal...!!!");
		}
	}
	public static void main(String[] args) {

		LargestNumber ln = new LargestNumber();
		ln.findLargestNumber(8,9);
	}

}
