
public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(String accountHolder , int accountNumber,  double balance) {
		this.accountHolder = accountHolder ;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount  ;
		System.out.println("Deposit Amount : "+amount);
	}
	
	
	public void withdraw(double amount){
		if(amount <= balance) {
			balance = balance - amount ;
			System.out.println("Remaining Balance : "+ balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void withdraw(double amount, String transitionsType) {
		if("ATM".equals(transitionsType)) {
			balance = balance - amount;
			System.out.println("Withdrawn Amount : "+ balance);
		}else if("Online".equals(transitionsType)) {
			balance = balance - amount ;
			System.out.println("Online Withdraw Amount : "+ balance );
		}else {
			System.out.println("Invalid transitionsType Type");
		}		
		
	}
	
	
	
	
	void displayAccountInfo() {
		System.out.println("accountNumber: " +accountNumber);
		System.out.println("accountHolder: " +accountHolder);
		System.out.println("Total Balance : "+ balance);
		
	}

	
	

}
