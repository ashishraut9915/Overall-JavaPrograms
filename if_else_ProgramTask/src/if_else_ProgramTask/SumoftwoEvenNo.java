package if_else_ProgramTask;

public class SumoftwoEvenNo {

	void findSumEven(int num1 , int num2) {
		if(num1 % 2 == 0 && num2 % 2 == 0) {
			int add = num1 + num2 ;
			System.out.println("Add of two even no = "+add);
			
		}else {
			System.out.println("no is not even");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumoftwoEvenNo sen = new SumoftwoEvenNo();
		sen.findSumEven(11, 24);
		
	}

}
