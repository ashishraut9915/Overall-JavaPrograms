package Hierarchy_Inheritance;

public class LibraryItem {

protected	String title ;
protected	int itemId ;
	
	LibraryItem(String title,int itemId){
		this.title = title ;
		this.itemId = itemId;
		
	}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	void displayItem() {
		System.out.println("Title = "+ title);
		System.out.println("itemId = "+itemId);
	}
	
	
}




