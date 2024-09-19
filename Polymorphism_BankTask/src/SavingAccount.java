
public class SavingAccount extends  Account {
	double maximumWithdrawAmountthisMonth, WithdrawCountthisMonth ;


	public SavingAccount(String accountHolder, int accountNumber, double balance) {
		super(accountHolder, accountNumber, balance);
		this.maximumWithdrawAmountthisMonth = maximumWithdrawAmountthisMonth ; 
		this.WithdrawCountthisMonth = 30 ;
	}

	public void withdraw(double amount, double transitionsType){
		if("Saving".equals(transitionsType)) {
			if(maximumWithdrawAmountthisMonth <= WithdrawCountthisMonth ) {
				WithdrawCountthisMonth++;
				System.out.println("Total Withdraw = "+ WithdrawCountthisMonth);
			}else {
				System.out.println("Exceeded maximum withdrawals for this month for Savings Account");
			}
		}else {
			System.out.println("Invalid Transition Type");
		}
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	
	
	
	
	if(maximumWithdrawAmount <= WithdrawCount) {
		//balance = balance - amount ;
			super.withdraw(amount);
			WithdrawCount++;
			
			//System.out.println("Withdraw Successfully......!!!");
		}else {
            System.out.println("Exceeded maximum withdrawals for this month for Savings Account");
		}
	}else {
        System.out.println("Invalid Transition Type For Savng Account");
	}*/