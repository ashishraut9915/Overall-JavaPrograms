
public class Clothing extends Product {

	double size;
	String color;
	String material;
	Clothing(String name,String discription, double price,double size,String color,String material ){
		super(name,discription,price);
		this.size =size;
		this.color = color ;
		this.material = material;
		
	}
}
