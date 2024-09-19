
public class Book extends LibraryItem {
	
	
	//private static String author;
	private int genre, numberofPages;
	
	
	Book( String title, String author, String location,int genre, int numberofPages){
	super(title,author,location);
	
	this.genre = genre ;
	this.numberofPages = numberofPages ;
	
	}
	
	/*
	public int getGeneration() {
		return genre;
	}
	
	public int getnumberofPages() {
		return numberofPages;
	}
	*/
	
	@Override
	public void displayInfo() {
	/*	System.out.println("Title is : "+ title);
		System.out.println("Author name is : "+ author);
		System.out.println("Location is : "+location);*/
		super.displayInfo();
		System.out.println("Generation is : "+genre);
		System.out.println("No of Pages : "+ numberofPages);
	}
	
}
