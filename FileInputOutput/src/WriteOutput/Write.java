package WriteOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\HP\\Desktop\\New.txt");
		String p = "Jethalal Champaklal Gada";
		byte[] b = p.getBytes();
		fo.write(b);
		System.out.println("Done");
	}
}
