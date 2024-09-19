package polymorphism;

public class OverLoadingTest {

	
	public static void main(String[] args) {
	OverLoadingScenarios loadingScenarios = new OverLoadingScenarios ();
	

	// Scene I

	A a=new A();

	loadingScenarios.ml (a);

	// Scene II

	B b = new B(); loadingScenarios.ml(b);

	// Scene III

	C c=new C(); loadingScenarios.ml (c);

	// Scene IV

	B bc = new C();

	loadingScenarios.ml(bc);

	// Scene V

	A ab=new B();
	loadingScenarios.ml (ab);

	// Scene VI*/

	loadingScenarios.ml (null);
	
	}
	
	
}
