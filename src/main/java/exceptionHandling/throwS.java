package exceptionHandling;

import java.io.IOException;

public class throwS {

	public static void checkFileName(String filename) throws IOException {
		
		if(!filename.endsWith(".txt")) {
			
			throw new IOException("File name is not correct");
		}
		
		else {
			System.out.println("File Name is correct");
		}
	}
	public static void main(String[] args) {
		
		try {
			
			checkFileName("test.doc");
			
		} catch (IOException e) {

			System.out.println("Caught the exception");
			System.out.println("Exception occured: "+e);
		}
		
		System.out.println("Rest of the code");
	}
}

/*
 * Sure, I can explain the example in short. The example shows a method called
 * checkFileName that takes a string as a parameter and throws an IOException if
 * the string does not end with “.txt”. The main method calls this method and
 * handles the IOException using a try-catch block. If the exception occurs, it
 * prints the message from the exception object. Otherwise, it prints “File name
 * is correct
 */

