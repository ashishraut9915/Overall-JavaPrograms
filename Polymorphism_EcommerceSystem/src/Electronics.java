
public class Electronics extends Product {

	int warrantyPeriod ;
	String brand;
	Electronics(String name,String discription, double price,int warrantyPeriod,String brand){
		super(name,discription,price);
		this.warrantyPeriod = warrantyPeriod ;
		this.brand = brand ;
	}
	
	@Override
	void calculateDiscount(double listPrice,double sellingPrice,  double disc) {
		this.disc = (listPrice - sellingPrice)/listPrice * 100;
		System.out.println("Total Disc for Electronic Items= "+ disc);
	}
}
