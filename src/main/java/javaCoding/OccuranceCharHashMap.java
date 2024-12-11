package javaCoding;

import java.util.HashMap;

public class OccuranceCharHashMap {

	public static void main(String[] args) {
		
		String str = "Hew what is this you are trying to do here";
		
		char[] chs = str.toCharArray();
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		
		for(char ch : chs) {
			
			if(Character.isWhitespace(ch)) {
				
				continue;
			}
			if(hs.containsKey(ch) ) {
				int count = hs.get(ch);
				hs.put(ch, ++count);
			}
			

			
			else {
				hs.put(ch, 1);
			}
		}
		
		System.out.println(hs);
	}
}
