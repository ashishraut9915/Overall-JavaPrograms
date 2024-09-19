package timepass;

public class A {

	int x = 10 ;  
	
}

class B extends A{
	int x = 20 ;
	
}

class C extends B{
	int x = 30 ;
}

class D extends C{
	int x = 40 ;
	
	void m1() {
		int x = 50 ;
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		B b = new B();
		System.out.println(b.x);
		A a = new A();
		System.out.println(a.x);
	}
}