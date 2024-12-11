package javaCodingNovember2024;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public void checkAnagram(String value1, String value2) {

		char[] ch1 = value1.toLowerCase().toCharArray();
		char[] ch2 = value2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {

			System.out.println("String are aragram");
		}

		else {

			System.out.println("These are not anagram");
		}
	}

	public static void main(String[] args) {

		System.out.println("Please enter String 1 and String 2");
		Scanner sc = new Scanner(System.in);
		String value1 = sc.next();
		String value2 = sc.next();

		AnagramString obj = new AnagramString();
		obj.checkAnagram(value1, value2);
	}
}
