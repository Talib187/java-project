package javaCodingNovember2024;

public class PalindromeNumber {

	public static void main(String[] args) {
// Palindrome number are same in reverse and forward.
		int num = 1551;
		int temp = num;
		int rev = 0;

		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println("Number is Palindrome: " + temp);
		} else {
			System.out.println("Number is not Palindrome " + temp);
		}

	}
}
