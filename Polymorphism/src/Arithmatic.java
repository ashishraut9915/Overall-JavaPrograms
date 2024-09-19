
public class Arithmatic {
	void sum(int a) {
		System.out.println(a+a);
	}
	
	void sum(double a) {
		System.out.println(a+a);
	}
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	void sum(int a, double b) {
		System.out.println(a+b);
	}
	
	void sum(double a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Arithmatic ar = new Arithmatic();
		ar.sum(1);
		ar.sum(2.1);
		ar.sum(5.5, 5.5);
		ar.sum(5, 8);
		ar.sum(5, 5.5);
		ar.sum(4.5, 3);
		
	}
}
