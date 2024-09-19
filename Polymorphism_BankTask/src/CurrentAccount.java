
public class CurrentAccount extends Account{
	double maximumWithdrawAmountthisMonth, WithdrawCountthisMonth ;

	public CurrentAccount(String accountHolder, int accountNumber, double balance) {
		super(accountHolder, accountNumber, balance);
		//super(accountHolder, accountNumber, balance);
		this.maximumWithdrawAmountthisMonth = maximumWithdrawAmountthisMonth ; 
		this.WithdrawCountthisMonth = WithdrawCountthisMonth ;
	}
	
	
	public void withdraw(double amount, double transitionsType){
		if("CurentAccount".equals(transitionsType)) {
			if(maximumWithdrawAmountthisMonth <= WithdrawCountthisMonth ) {
				WithdrawCountthisMonth++;
				System.out.println("Total Withdraw = "+ WithdrawCountthisMonth);
			}else {
				System.out.println("Exceeded maximum withdrawals for this month for Current Account");
			}
		}else {
			System.out.println("Invalid Transitiozn Type");
		}
	}
	
	public static void main(String[] args) {
		
		CurrentAccount a = new CurrentAccount ("Ashish Raut",41324915,30000);
		a.deposit(15000);
		a.withdraw(15000);
		
		System.out.println("-----------------------------");
		a.deposit(20000);
		
		System.out.println("-----------------------------");
		a.displayAccountInfo();
		
		/*System.out.println("-----------------------------");
		a.withdraw(5,"CurentAccount");*/
		
	}

}
