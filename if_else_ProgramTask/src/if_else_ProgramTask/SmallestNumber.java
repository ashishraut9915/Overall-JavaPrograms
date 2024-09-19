package if_else_ProgramTask;

public class SmallestNumber {
	
	void findSmallNumber(int num1, int num2) {
		if(num1 < num2 && num2 > num1) {
			System.out.println("Num1 is Small...!!!");
		}else if(num2 < num1 && num1 > num2) {
			System.out.println("Num2 is Small...!!!");
		}else {
			System.out.println("Both are Equal...!!!");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		SmallestNumber sn = new SmallestNumber();
		sn.findSmallNumber(9,9);
	}
}
