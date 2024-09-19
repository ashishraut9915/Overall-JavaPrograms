package ExtendsThread;

public class Test {

	public static void main(String[] args) {
	
		World w = new World();
		w.start();
		
		for(int i = 0; i<=200; i++)
		{
			System.out.println("Hello");
		}
	}
}
