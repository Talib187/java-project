package javaCoding;

import java.util.Arrays;

public class AnagramStringMethod {

	public static boolean areAnagram(String str1, String str2) {

		String str11 = str1.toLowerCase();
		String str22 = str2.toLowerCase();

		char[] c1 = str11.toCharArray();
		char[] c2 = str22.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		boolean result = Arrays.equals(c1, c2);
		return result;
	}

	public static void main(String[] args) {

		String str1 = "Care";
		String str2 = "Race";

		if (areAnagram(str1, str2)) {

			System.out.println("Stirng are anagram");
		}

		if (areAnagram(str1, str2) == false) {

			System.out.println("String are not Anagram");
		}
	}
}
