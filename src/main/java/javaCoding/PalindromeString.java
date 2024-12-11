package javaCoding;

public class PalindromeString {

	public static void main(String[] args) {

		String st = "Nitind";
		String str = st.toLowerCase();
		String temp = str;
		String sum = "";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			sum = sum + ch[i];
		}

		if(sum.equals(temp)) {
			
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Is not palindrome");
		}
	}

}
