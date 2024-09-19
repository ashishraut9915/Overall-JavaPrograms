package MostAskInterviewQuestions;

public class ReverseNumber {

	public void reverse(int n) {
		
		for(int i = 0; i<= n; i++) {
			for(int j = n-1; j >= n ;j--) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		rn.reverse(1234);
	}
}
