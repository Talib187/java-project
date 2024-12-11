package javaBasic;

public class stringBufferDemo {

	public static void main(String[] args) {

//		StringBuffer sb = new StringBuffer();
		StringBuffer sb = new StringBuffer("Hello");

		// Append another string to the end of the buffer

		sb.append("World!"); // Output: sb = "Hello World!"

		// Insert a string at a specified position in the buffer

		sb.insert(0, "Java "); // output: sb = JavaHelloWorld!

		// Replace a substring in the buffer with another string
		sb.replace(11, 17, "Geeks"); // Output: sb = "Hello Java Geeks!"

		// Delete a substring from the buffer
		sb.delete(5, 6); // Output: sb = "HelloJava Geeks!"

		// Reverse the order of the characters in the buffer
		sb.reverse(); 		// Output: sb = "!skeeG avaJolleH"
//		System.out.println(sb.toString());

		
		// Get the current capacity of the buffer
		int cap = sb.capacity();    // Output: cap = 23
		
		// Get the character at a specified position in the buffer
		char ch = sb.charAt(3);		// Output: ch = 'e'
		
		// Get the length of the buffer
		int len = sb.length();			// Output: len = 17
		
		// Get a substring from the buffer
		String sub = sb.substring(4, 9);		// Output: sub = "G ava"
		
		// Convert the buffer to a String and print it
		String message = sb.toString();
		System.out.println(message);

	}
}
