package javaCoding;

import java.util.ArrayList;

public class DigitFromString {

	public static int[] getDigit(String input) {

		System.out.println("hello");
		char[] ch = input.toCharArray();
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for (char ch1 : ch) {

			if (Character.isDigit(ch1)) {

				String newStr = Character.toString(ch1);
				int digit = Integer.parseInt(newStr);
				
				digits.add(digit);
			}
		}

		// Converting arraylist into array:
		
		int[] result = new int[digits.size()];
		for(int i=0; i<digits.size(); i++) {
			
			result[i] = digits.get(i);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = getDigit("Hey1 what 3 is 5");
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.println(nums[i]);
		}
	}
}
