import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibraryMain {

	public static void main(String[] args) {
	/*	LibraryItem li = new LibraryItem("Sham chi Aai", "Sane Guruji", "Pune");
		LibraryItem li1= new LibraryItem("The Monk", "Matthew Gregory Lewis", "London");
		LibraryItem li2 = new LibraryItem("Rich Dad Poor Dad", "Robert T. Kiyosaki and Sharon Lechter", "New York ");
		LibraryItem li3 = new LibraryItem("Java", "Kiran Sir", "Pune");
		li.displayInfo();
		li1.displayInfo();*/
		
	        Scanner scanner = new Scanner(System.in);
	        List<LibraryItem> library = new ArrayList<>();

	        while (true) {
	            System.out.println("1. Add a Book");
	            System.out.println("2. Add an EBook");
	            System.out.println("3. Add a DVD");
	            System.out.println("4. Display Info");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book Title: ");
	                    String bookTitle = scanner.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Enter Location: ");
	                    String location = scanner.nextLine();
	                    System.out.print("Enter Genre: ");
	                    int genre = scanner.nextInt();
	                    System.out.print("Enter Number of Pages: ");
	                    int numberofPages = scanner.nextInt();
	                    library.add(new Book(bookTitle, author, location, genre, numberofPages));
	                    break;
	                case 2:
	                    System.out.print("Enter EBook Title: ");
	                    String eBookTitle = scanner.nextLine();
	                    System.out.print("Enter Author: ");
	                    author = scanner.nextLine();
	                    System.out.print("Enter Location: ");
	                    location = scanner.nextLine();
	                    System.out.print("Enter Format (e.g., PDF, ePub): ");
	                    String format = scanner.nextLine();
	                    System.out.print("Enter File Size (in MB): ");
	                    int fileSize = scanner.nextInt();
	                    library.add(new EBook(eBookTitle, author, location, format, fileSize));
	                    break;
	                case 3:
	                    System.out.print("Enter DVD Title: ");
	                    String dvdTitle = scanner.nextLine();
	                    System.out.print("Enter Director: ");
	                    String director = scanner.nextLine();
	                    System.out.print("Enter Location: ");
	                    location = scanner.nextLine();
	                    System.out.print("Enter Run Time (in minutes): ");
	                    int runTime = scanner.nextInt();
	                    library.add(new DVD(dvdTitle, director, location, director, runTime));
	                    break;
	                case 4:
	                    System.out.print("Enter the title of the item to display information: ");
	                    String searchTitle = scanner.nextLine();
	                    for (LibraryItem item : library) {
	                        if (item instanceof LibraryItem && item.displayInfo) {
	                            if (item.getTitle().equalsIgnoreCase(searchTitle)) {
	                                item.displayInfo();
	                            }
	                        }
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}