
public class LibraryBook {
	String title;
	String author ;
	String isbn;
	Boolean available  ;
	
	LibraryBook(String title, String author, String isbn, Boolean available){
		this.title = title ;
		this.author = author ;
		this.isbn = isbn ;
		this.available = true;
		
	}
	
	public void borrowBook(){
		if(available) {
			available = false;
			System.out.println("---------You have Successfully borrowed the book------------");
		}else {
			System.out.println("Sorry, the book"+ title + "is not available");
		}
	}
	
	public void returnBook(){
		if(!available) {
			available = true ;
			System.out.println("----------You have Successfully Return the Book-------------");
		}else {
			System.out.println("Sorry the book"+ title + "is Not Available");
		}
	}
	
	public static void main(String[] args) {
		LibraryBook lb = new LibraryBook("TheKiranAcademy134", "SagarBhai", "1134SB", true);
		LibraryBook lb1 = new LibraryBook("ShamChiAai", "Sane Gurugi", "1546gyw", true);
		
		lb.borrowBook();
		lb.returnBook();
		
		lb1.borrowBook();
		lb1.returnBook();
		
	}
	
}
