package javaCodingNovember2023;

import java.util.Arrays;

public class AnagramNov {

	public static void main(String[] args) {

		String str1 = "Racre";
		String str2 = "Care";

		if (str1.length() == str2.length()) {

			String str11 = str1.toLowerCase();
			String str22 = str2.toLowerCase();

			char[] ch1 = str11.toCharArray();
			char[] ch2 = str22.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean result = Arrays.equals(ch1, ch2);

			if (result) {

				System.out.print("String are Anagram");
			}

			else {
				System.out.print("String are not anagram");
			}

		}

		else {

			System.out.println("Strings are not Anagram");
		}
	}
}
