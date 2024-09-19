
public class LibraryItem {

	private String title, author, location;
	
	public boolean displayInfo;
	
	LibraryItem(String title, String author, String location){
		this.title = title ;
		this.author = author ;
		this.location = location ;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthhor() {
		return author ;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void displayInfo() {
		System.out.println("Title is : "+ title);
		System.out.println("Author name is : "+ author);
		System.out.println("Location is : "+location);
	
	}
	
	
}
