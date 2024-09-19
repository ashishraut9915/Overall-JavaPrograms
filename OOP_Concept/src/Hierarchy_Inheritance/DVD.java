package Hierarchy_Inheritance;

public class DVD extends LibraryItem {
private	int duration;
	DVD(String title, int itemId, int duration) {
		super(title, itemId);
		this.duration = duration ;
		//this.title = title;
		//this.itemId = itemId ;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayItem() {
		
		System.out.println("Title = "+ title);
		System.out.println("itemId = "+itemId);
		System.out.println("Duration of DVD = "+duration);
	}
}
