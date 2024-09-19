import java.util.ArrayList;

	 public class LibraryItem11 {
	    private String title;
	    private String author;
	    private String location;

	    public LibraryItem11(String title, String author, String location) {
	        this.title = title;
	        this.author = author;
	        this.location = location;
	    }

	    public void LibraryItem1(String title2, String author2, String location2) {
			// TODO Auto-generated constructor stub
		}

		public void displayInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Location: " + location);
	    }

	    // Getter methods for searching
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getLocation() {
	        return location;
	    }
	}

