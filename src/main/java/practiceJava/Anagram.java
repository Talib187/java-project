package practiceJava;

// Anagram are the String which have equals number of character and by arranging the characters from the one string we can make the second string.
import java.util.Arrays;

public class Anagram {

	public boolean checkAnagram(String str1, String str2) {
		String str11 = str1.toLowerCase();
		String str22 = str2.toLowerCase();

		char[] ch1 = str11.toCharArray();
		char[] ch2 = str22.toCharArray();

		if (ch1.length == ch2.length) {

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean result = Arrays.equals(ch1, ch2);

			if (result) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "Care";

		Anagram obj = new Anagram();
		boolean result = obj.checkAnagram(str1, str2);

		if (result) {
			System.out.println("String is anagram");

		} else {
			System.out.println("String is not anagram");

		}
	}
}
