
public class StringObject {
 
	
	
	public static void main(String[] args) {
		
		String p = "Hello" ;//String Literal ---------> String Constant Pool
		String s1 = "Hello" ;//String Literal (Memory)---------> String Constant Pool
		String s2 = "Hello";
		
		String s3 = new String("Hello");  //String Object-----> Heap Memory
		String s4 = new String("Hello");  //String Object-----> Heap Memory

		System.out.println(s1);
		System.out.println(p);
		
			//String Literal
		
		
		System.out.println(s1);
		System.out.println(s1+s2);
		System.out.println(s1+s1);
		
		/*s = p;
		p = s1;
		s1 = s;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(p);*/
		
		System.out.println("----------Guss True || False-----------");
		
		System.out.println(s1==s2); // scp == scp char
		System.out.println(s1.equals(s2)); // scp scp
		
		System.out.println("---------------------");
		
		System.out.println(s1 == s3); // False heap && SCP
		System.out.println(s1.equals(s3));// true heap && SCP(memory) char
		System.out.println(s3.equals(s4));
		
		
		
	}
}
