package Hierarchy_Inheritance;

public abstract class LibraryMember {

	private int memberID ;
	private String name ;
	
	
	LibraryMember(int memberID,String name){
		this.memberID = memberID;
		this.name = name;
	}
	
	public int getMemberID() {
		return memberID;
	}

	/*public void setMemberID(int memberID) {
		this.memberID = memberID;
	}*/

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	abstract void borrowItem();
}
