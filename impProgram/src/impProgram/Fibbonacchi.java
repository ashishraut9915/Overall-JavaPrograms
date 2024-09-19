package impProgram;

public class Fibbonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int num1 = 0 ;
				int num2 = 1 ;
				
				System.out.print(num1+ " " + num2 + " ");
				for(int i = 3 ; i <= 9 ; i++) {
					int fibo = num1 + num2 ;
					System.out.print(fibo+" ");
					num1 = num2 ;
					num2 = fibo ;
				}
			}
	}

