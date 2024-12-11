package javaCoding;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 231432;
		int temp = num;
		int sum = 0;
		while(num>0) {
			
			int a = num%10;
			
			sum = a+sum*10;
			
			num = num/10;
		}

		if(sum==temp) {
			
			System.out.println("Number is palindrome");
		}
		
		else {
			System.out.println("Number is not palindrome");
		}
	}
}