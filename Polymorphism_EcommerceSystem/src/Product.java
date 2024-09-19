
public class Product {

	//generic product
	
	String name;
	String discription ;
	double price;
	double disc;
	Product(String name,String discription, double price){
		this.name = name ;
		this.discription = discription ;
		this.price = price ;
	}
	
	void calculateDiscount(double listPrice,double sellingPrice,  double disc) {
		this.disc = (listPrice - sellingPrice)/listPrice * 100;
		System.out.println("Total Disc for generic product = "+ disc);
	}
	
}
