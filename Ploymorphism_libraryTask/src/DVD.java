
public class DVD extends LibraryItem {
	private String directorName;
	private int runTime;
	DVD(String title, String author, String location, String directorName ,int runTime){
		super(title,author,location);
		this.directorName = directorName;
		this.runTime = runTime;
		
	}
	
	/*
	public String getdirectorName() {
		return directorName;
	}
	
	public String getrunTime() {
		return runTime;
	}*/
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("EBook PDF : "+ directorName);
		System.out.println("EBook ePub : "+runTime);
	
	}
}
