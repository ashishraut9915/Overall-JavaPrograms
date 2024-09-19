package Arithmatic_Operations;

public class Operations {
	
	
	void add(int a, int b){
		int Addition = a + b;
		System.out.println("Addition is = "+ Addition);
		
	}
	
	void sub(int a, int b, int c) {
		int Substraction = a - b - c;
		System.out.println("Substraction is = "+Substraction);
	}
	
	void mul(int a, int b) {
		int Multiplication = a * b ;
		System.out.println("Multiplication is = "+Multiplication);
	}
	
	void div(double a, double b) {
		double Division = a / b;
		System.out.println("Division is = "+ Division);
	}
	
	void avg (double a, double b){
		double Average = (a + b ) / 2 ;
		System.out.println("Average is = "+ Average);		
	}
	
	void Area_of_Rectangle(int l, int b) {
		int area_rect = l * b ;
		System.out.println("Area of Rectangle is = "+ area_rect);
	}
	void Area_of_Square(int a) {
		int area_square = a * a ;
		System.out.println("Area of Square is = "+ area_square);
	}
	void Area_of_Triangle(double b , double h) {
		double area_triangle = 1 / 2 * (b * h) ;
		System.out.println("Area of Triangle is = "+ area_triangle);
	}
	
	void Area_of_Circle(double radius) {
		double area_circle = 3.14 *( radius * radius );
		System.out.println("Area of Circle is = "+ area_circle);
	}
	void Area_of_Sphere(double r) {
		double area_sphere = 4 * 3.14 * r * r ;
		System.out.println("Area of Sphere is = "+ area_sphere);
	}
	void Volume_of_Cylinder(double r, double h) {
		double volume_cylinder = 3.14 * r * r * h ;
		System.out.println("Volume of Cylinder is = "+ volume_cylinder);
	}
	void Volume_of_Sphere(double r) {
		double volume_sphere = 4 / 3 * (3.14 * r * r * r);
		System.out.println("Volume of sphere is = "+ volume_sphere);
	}
	
	
	public static void main(String args[]) {
		Operations op = new Operations();
		op.add(10, 20);
		op.sub(10, 20,30);
		op.mul(10, 30);
		op.div(30, 2);
		op.avg(50, 60);
		op.Area_of_Rectangle(100, 30);
		op.Area_of_Square(10);
		op.Area_of_Triangle(10, 20);
		op.Area_of_Circle(20);
		op.Area_of_Sphere(25);
		op.Volume_of_Cylinder(3, 9);
		op.Volume_of_Sphere(9);
	}

}
