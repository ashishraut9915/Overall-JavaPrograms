package if_else_ProgramTask;

public class Even {
int n;
	public void even(int n) {
		if(n % 2  == 0) {
			System.out.println("It is Even");
		}
	}
	
	public static void main(String[] args) {
		Even e = new Even();
		e.even(14);
		
	}
}
