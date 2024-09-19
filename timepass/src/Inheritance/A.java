package Inheritance;

public class A {

	A(){
	System.out.println("A");	
	}
	
	void m2() {
		System.out.println("m2");
	}
}

class B extends A{
	
	B(){
		System.out.println("B");
	}
	
	void m1() {
		System.out.println("M1");
	}
}

class C extends B{
	C(){
		
		System.out.println("C");
	}
	
}
