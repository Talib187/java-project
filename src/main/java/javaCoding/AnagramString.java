package javaCoding;

import java.util.Arrays;

public class AnagramString {

	public static void main(String args[]) {

		String str1 = "Race";
		String str2 = "Carde";
		
		String str11 = str1.toLowerCase();
		String str22 = str2.toLowerCase();
		
		if(str11.length()==str22.length()) {
			
			char[] c1 = str11.toCharArray();
			char[] c2 = str22.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)){
				
				System.out.println("String is Anagram");
			}
			
			else {
				
				System.out.println("String is not Anagram");
			}
		}
		
		else {
			
			System.out.println("Given strings are not anagram");
		}
	}

}
