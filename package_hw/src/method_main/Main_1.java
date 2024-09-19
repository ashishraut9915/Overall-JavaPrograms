package method_main;

import Add.Addition;
import Area_rectangle.Area_Rectangle;
import Avg.Average;

public class Main_1 {


public static void main(String args[]) {
	Average av=new Average();
	av.avg_opt(40, 40, 45, 25);
	
	Addition ad = new Addition();
	ad.add_opt(45, 15);
	
	Area_Rectangle ar = new Area_Rectangle();
	ar.Area_of_Rectangle(45, 78);
	}
}