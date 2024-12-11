package exceptionHandling;

public class MultipleCatchExample {

	  public static void main(String[] args) {
	    // declare and initialize an array of integers
	    int[] numbers = {10, 20, 30, 40};
	    // use a try block to enclose the code that may throw an exception
	    try {
	      // get the first argument from the command line
	      String input = args[0];
	      // try to parse the input as an integer
	      int index = Integer.parseInt(input);
	      // try to access the array element at the given index
	      int number = numbers[index];
	      // print the number
	      System.out.println("The number at index " + index + " is " + number);
	    }
	    // use a catch block to handle the NumberFormatException
	    catch (NumberFormatException e) {
	      // print the exception message
	      System.out.println("Invalid input: " + e.getMessage());
	    }
	    // use another catch block to handle the ArrayIndexOutOfBoundsException
	    catch (ArrayIndexOutOfBoundsException e) {
	      // print the exception message
	      System.out.println("Index out of bounds: " + e.getMessage());
	    }
	    // use a finally block to execute some code regardless of whether an exception occurs or not
	    finally {
	      // print a message
	      System.out.println("End of program");
	    }
	  }
	}

