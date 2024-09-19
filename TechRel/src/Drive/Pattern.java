package Drive;
import java.io.*;
public class Pattern {

	public static void main(String[] args)
	{
		int number = 3;
		int mi = 1;
		int n;
		do {
			n = 1;
			do {
				System.out.print(" ");
			}
			while (++n <= number - mi + 1);
			n = 1;
			do {	
				System.out.print("*");
			}
			while (++n <= mi * 2 - 1);
			System.out.println();

		}
		while (++mi <= number);
		mi = number - 1;
		do {
			n = 1;
			do {
				System.out.print(" ");
			} while (++n <= number - mi + 1);
			n = 1;
			do {
				System.out.print("*");
			} while (++n <= mi * 2 - 1);
			System.out.println();
		}
		while (--mi > 0);
	}
}

