package javaCoding;

import java.util.HashMap;

public class CountWordHashMap {

	public static void main(String[] args) {

		String input = "the quick brown fox jumps over the lazy dog";
		String[] split = input.split(" ");

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		for (int i = 0; i < split.length; i++) {

			if (hs.containsKey(split[i])) {

				int count = hs.get(split[i]);
				hs.put(split[i], count + 1);
			} else {
				hs.put(split[i], 1);
			}
		}
		System.out.println("Frequency of the word is: ");
		System.out.println(hs);

		// Count the total number of words
		int totalCount = 0;
		for (int count : hs.values()) {
			totalCount = count + totalCount;
		}

		System.out.println("Total count is: " + totalCount);
	}
}

// https://prnt.sc/qn-JTX_rgtDz
