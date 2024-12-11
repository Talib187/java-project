package javaCoding;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateUsingHashMap {
	public static void main(String[] args) {

		String str = "this is done not done by this";
		String[] split = str.split(" ");
		int count = 0;

		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		HashSet<String> duplicates = new HashSet<String>();

		for (int i = 0; i < split.length; i++) {

			if (hs.containsKey(split[i])) {

				count = hs.get(split[i]);
				hs.put(split[i], count + 1);
			}

			else {
				hs.put(split[i], 1);
			}
		}
		System.out.println(hs);

		// To find duplicate value Iterate over the HashMap and print the words with
		// count greater than 1

		for (int i = 0; i < split.length; i++) {

			if (hs.get(split[i]) > 1) {

				System.out.println(split[i]);
			}
		}
	}
}
