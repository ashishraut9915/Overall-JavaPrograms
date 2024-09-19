package Drive;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(25, "Ajay");
		hm.put(65, "Virat");
		hm.put(76, "Rohit");
		hm.put(100, "Shreyash");
		hm.put(122, "Gill");
		
		System.out.println("Score and Name :"+ hm );
		
		System.out.println(hm.containsKey(25));
	}
}

