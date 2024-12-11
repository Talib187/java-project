package javaCoding;

public class CountWordWithoutSplit {

	public static int getCount(String str) {
		int count = 0;

		char[] ch = new char[str.length()];
		
// This line of code creates a new character array of size equal to the
// length of the input string. The string.length() method returns the number
// of characters in the string, and this value is used as the size of the
// character array ch[].

		for (int i = 0; i < str.length(); i++) {

			ch[i] = str.charAt(i);

			if (((i > 0) && (ch[i] != ' ') && ch[i - 1] == ' ') || ((ch[0] != ' ') && (i == 0))) {

				count++;

			}
		}

		return count;
	}

	public static void main(String[] args) {

		String str = "Where   are  you   not going ";
		System.out.println("Number of worrd in the string are: " + getCount(str));
	}

}

/*
 * ((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) This checks if i is greater
 * than 0 (meaning not the first character in the string), if the current
 * character ch[i] is not a space, and if the previous character ch[i - 1] is a
 * space. If all of these conditions are true, then it means a new word has
 * started.
 * 
 * ((ch[0] != ' ') && (i == 0))
 * 
 * This checks if the first character ch[0] is not a space and if i is 0,
 * meaning we are looking at the first character of the string. If this is true,
 * it means a new word has started.
 */