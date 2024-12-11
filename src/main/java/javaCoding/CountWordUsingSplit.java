package javaCoding;

public class CountWordUsingSplit {

	public static void main(String[] args) {

		String str = "Hello, how   are you?";  

		String[] word = str.split(" ");

		System.out.println(word.length);
	}
}
// This will only work when there is only single space.