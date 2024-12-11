package exceptionHandling;

public class TryBlockExample {

  public static void main(String[] args) {
    // declare a variable to store the result of division
    int result = 1;

    // use a try block to enclose the code that may throw an exception
    try {
      // declare and initialize a local variable that is only visible within the try block
      int divisor = Integer.parseInt(args[0]); // this may throw a NumberFormatException if args[0] is not a valid integer
      // try to divide 10 by the divisor, which may throw an ArithmeticException if the divisor is zero
      result = 10 / divisor;
      // this line will be executed if no exception occurs
      System.out.println("The result is " + result);
      // use a return statement to exit the method, but the finally block will still execute after this
      return;
    }
    // use a catch block to handle the specific exception that may occur in the try block
    catch (NumberFormatException e) {
      // print the exception message
      System.out.println("Invalid input: " + e.getMessage());
      // assign a default value to the result variable
      result = -1;
    }
    catch (ArithmeticException e) {
      // print the exception message
      System.out.println("Cannot divide by zero: " + e.getMessage());
      // assign a default value to the result variable
      result = -1;
    }
    // use a finally block to execute some code regardless of whether an exception occurs or not
    finally {
      // print the final value of the result variable
      System.out.println("The final result is " + result);
      // close any resources or perform any cleanup tasks here
    }
  }
}
