package javaCodingNovember2024;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "madamm";
		String revString ="";
		String temp =str;
		char[] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			
			revString = revString + ch[i];
		}
		
		if(revString.equals(temp)) {
			
			System.out.println("String is palindrome");
		} else
		{
			System.out.println("String is not palindrome");
		}
	}
}
