package if_else_ProgramTask;

public class SumOddEven {
int num1,num2;
	void odd_evenSum(int num1,int num2) {
		if(num1 % 2 == 0 &&  num2 % 2 ==0) {
			int evenSum = num1 + num2 ;
			System.out.println("Sum of Even no is = "+evenSum);
		}else if( num1 % 2 != 0 &&  num2 % 2 != 0){
			  int oddSum = num1 + num2 ;
			  System.out.println("Sum of Odd no is = "+oddSum);
		}else {
			System.out.println("Plz give Even nos or Odd nos...!!!");
		}
	}
	
	
	
	public static void main(String[] args) {
		SumOddEven soe = new SumOddEven();
		soe.odd_evenSum(2,2);
	}
}
