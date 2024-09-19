import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Desktop\\Sample.txt");
		int temp = 0 ;
		while((temp = fs.read())!= -1 ) {
			System.out.print((char)temp);
			temp++;
		}
	}
}
