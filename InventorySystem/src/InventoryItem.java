

// remaining 


public class InventoryItem {
//static
static	int totalItems ;
	String itemName ;
//static
	static int quantity ;
	static	int availableItems ;
	static	int allItems ;
	
	 InventoryItem(String itemName, int totalItems ) {
	//	System.out.println(itemName + " " +totalItems );
		this.itemName = itemName ;
		InventoryItem.totalItems = totalItems;
	}
	
	static int addToInventory(int quantity) {

		int totalItems = quantity;
		int allItems = totalItems + quantity ;
		//System.out.println("ADD items is = "+allItems);
		return allItems;
		
	}
	static int removeFromInventory(int quantity1) {
		
		int availableItems = totalItems - quantity1 ;
		//System.out.println("Available Items is = "+availableItems);
		return availableItems;
	}
	
	 
	 void getTotalItems() {
		 int get_total = allItems + availableItems ;
		 System.out.println("Total Items = "+get_total);
	 }
	
	
	
	

	public static void main(String[] args) {
	
		InventoryItem ii1 = new InventoryItem("Green_Tea", 50);
		//ii1.addToInventory(15);
		//ii1.getTotalItems();
	
			
		
	}
}
