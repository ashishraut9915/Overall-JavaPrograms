package if_else_ProgramTask;

public class ZeroPositiveNegative {

	void zero_poisitive_negative(int num) {
		
		if(num == 0 ) {
			System.out.println("Zero");
		}else if(num >= 1) {
			System.out.println("Positive Number");
		}else {
			System.out.println("Negative Number");
		}
		
	}
	
	public static void main(String[] args) {
		ZeroPositiveNegative zpn = new ZeroPositiveNegative();
		zpn.zero_poisitive_negative(8);
		
	}
}
