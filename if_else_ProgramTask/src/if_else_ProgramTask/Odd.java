package if_else_ProgramTask;

public class Odd {
	void odd(int num1) {
		if(num1 % 2 != 0 ) {
			System.out.println("ODD");
		}
	}
	
	public static void main(String[] args) {
		Odd oo = new Odd();
		oo.odd(13);
	}
}
