package if_else_ProgramTask;

import java.security.DomainCombiner;

public class Even_Odd {
	void even_odd(int n) {
		if(n % 2 ==0) {
			System.out.println("It is EVEN.....!!!");
		}else {
			System.out.println("It is ODD.....!!!");
		}
	}
	
	public static void main(String args[]) {
		Even_Odd eo = new Even_Odd();
		eo.even_odd(15);
	
	}
}
