package Hierarchy_Inheritance;

public class TestInheritance {
	public static void main(String[] args) {
		Book b = new Book("AR", 123, "Ashu");
		//b.getAuthorName();
		b.displayItem();
		//b.Reversitem();
		System.out.println("--------------");
		DVD d =new DVD("title", 1254, 20);
		d.displayItem();
	//	LibraryMember L = new LibraryMember();
		StudentMember sm =new StudentMember();
		FacultyMember fm = new FacultyMember();
		
		
		//sm.borrowItem();
		//fm.borrowItem();
		
	}
}
