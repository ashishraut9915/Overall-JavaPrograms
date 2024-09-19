package Project;

import java.util.Scanner;

public class Room {

	String Standard, Deluxe, Suite;
	int n ;
	public Room(String standard, String Deluxe, String Suite) {
	
		this.Standard = standard;
		this.Deluxe = Deluxe;
		this.Suite = Suite;
	}
	
	void roomAvailability() {
		//this.n = n1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("1: standard\n"+"2 :Deluxe\n"+"3 :Suite");
		System.out.println("Enter your choice:");
		int n = sc.nextInt();
		
		
		
		switch(n) {
		
		case 1 : 
			System.out.println("Room Type:"+"Standard");
			break;
			
		case 2 :
			System.out.println("Room Type:"+"Deluxe");
			break;
			
		case 3 :
			System.out.println("Room Type:"+"suite");
			break;
			
			default :
				System.out.println("Room Type:"+"Ohhooo Sorry Not Available.......!!!!");
		}
		
		
		
		
	}
	
	
}




















/*public class Standard extends Room {

	public Standard(String standard, String deluxe, String suite) {
		super(standard, deluxe, suite);
	}
	
}*/
