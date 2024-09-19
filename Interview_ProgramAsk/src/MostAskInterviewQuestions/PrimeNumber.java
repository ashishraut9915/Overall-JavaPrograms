package MostAskInterviewQuestions;

public class PrimeNumber {

	public void checkPrime(int n) {
		int i ;
		int m = 0, flag = 0 ;
		m = n / 2 ;
		
		if(n == 1 || n == 0) {
			System.out.println(n + " is not a prime number");
		}else {
			for(i = 2 ; i <= m ; i++) {
				if(n % i == 0) {
					System.out.println(n+" is not a prime number");
					flag = 1 ;
					break ;
				}
			}
			
			if(flag == 0) {
				System.out.println(n + " is a prime number");
			}
		}
		
	}
	public static void main(String[] args) {
		
		PrimeNumber pn = new PrimeNumber();
		pn.checkPrime(12);
		
		
	}
}

/*
1)It defines a method checkPrime that takes an integer n as a parameter and 
							checks whether it is a prime number or not.
2)It initializes variables i, m, and flag.
3)If the input number n is 0 or 1, it prints that it is not a prime number.
4)Otherwise, it checks for factors of n from 2 to the square root of n.
5)If a factor is found, it prints that the number is not prime and sets the flag to 1.
6)If no factors are found (i.e., the flag remains 0), it prints that the number is prime.
7)The main method demonstrates the usage of the checkPrime method by calling it with 
							different numbers (1, 3, 17, and 20).

*/