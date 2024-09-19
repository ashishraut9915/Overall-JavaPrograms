package if_else_ProgramTask;

public class SumofTwoOddNo {

	void sumOdd(int num1,int num2) {
		if(num1 % 2 != 0 && num2 % 2 != 0) {
			int sum = num1 + num2 ;
			System.out.println("Sum of Odd number is = "+sum);
		}else {
			System.out.println("It is not ODD number....!!!");
		}
	}
	
	public static void main(String[] args) {
		SumofTwoOddNo sto = new SumofTwoOddNo();
		sto.sumOdd(2,11);
	}
}
