package Hierarchy_Inheritance;

public class Book extends LibraryItem {
	private String authorName;
	Book(String title, int itemId, String authorName ) {
		super(title, itemId);
		this.authorName=authorName;
		//this.title = title;
		//this.itemId = itemId ;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void displayItem() {
	System.out.println("Title = "+ title);
	System.out.println("itemId = "+itemId);
		System.out.println("Author Name = "+authorName);
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

	
}
