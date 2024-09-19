package Arithmatic_Operations;

public class Product {
	
	String product_id;
	int product_quantity;
	double p_amount;
	String product_name, product_brand;
	
	Product(){
		
	}
	
	    Product(String product_id,String product_brand, String product_name, int product_quantity, double p_amount){
		this.product_id =product_id;
		this.product_brand = product_brand;
		this.product_name = product_name ;
		this.product_quantity = product_quantity;
		this.p_amount = p_amount;
		System.out.println(product_id+ "        "+ product_brand + "        " +  product_name + "                "+ product_quantity + "           "+  p_amount);
		
		/*System.out.println(product_id);
		System.out.println(product_brand);
		System.out.println(product_name);
		System.out.println(product_quantity);
		System.out.println(p_amount);*/
	}
	

	public static void main(String[] args) {
	
	System.out.println("Product_ID"+ "  " + "Product_Brand"+ "  "+ "Product_Name"+ "  " + "Product_Quantity"+ "  " + "Product Amount");
	Product p = new Product("Afgs12", "NIKE","SHOES", 2, 80000);
	Product p1 = new Product("usg95df", "BATA","SANDLE", 1, 5000);
	Product p2 = new Product("hdcbj51", "PUMA","CROCKS", 1, 2500);
	Product p3 = new Product("hDIH51", "ADIDAS","SHOES", 3,8000);
	Product p4 = new Product("xh12", "PARAGON","SHOES", 3,8000);
	Product p5 = new Product("ms56s", "ASIAN","SHOES",2,8000);
	Product p6 = new Product("cms5jd", "AIR","SHOES", 3,8000);
	Product p7 = new Product("X1", "WOODLAND","SHOES", 3,8000);
	Product P8= new Product("kxm5", "REEBOK","SANDL", 4,8000);
	Product P9= new Product("nnc7", "PETERENG","SHOES", 3,8000);
	Product p10= new Product("nc7s", "SPARK","SHOES",1,8000);

	}
	

}
