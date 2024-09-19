
public class EBook extends LibraryItem {
	//private static numberofPages;
	//	private static Object genre;
	private  String format;
	private double fileSize;
	
	
	EBook(String title, String author, String location,String format, double fileSize){
		super( title,  author,  location);
		this.format = format ;
		this.fileSize= fileSize ;
	}
	
	/*
	public String getPDf() {
		return format;
	}
	
	public String ePub() {
		return ePub;
	}*/
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("EBook PDF : "+ format);
		//System.out.println("EBook ePub : "+ePub);
		System.out.println("FileSize : "+fileSize);
	}
	
}