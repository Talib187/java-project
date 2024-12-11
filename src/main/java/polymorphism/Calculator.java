package polymorphism;

// Method Overloading

public class Calculator {

	public void getAdd(int num1, int num2) {
		
		System.out.println(num1+num2);
	}
	
	public void getAdd(int num1, int num2, int num3) {
		
		System.out.println(num1+num2+num3);
	}
	
	public void getAdd(double	 num1, double num2) {
		
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.getAdd(10, 20);
		obj.getAdd(10, 10, 10);
		obj.getAdd(12.5, 7.5);
	}
}

/*
 * In this example, we have a Calculator class that has three add() methods with
 * different parameter types and/or numbers of parameters. The first add()
 * method takes two integers and returns their sum. The second add() method
 * takes three integers and returns their sum. The third add() method takes two
 * doubles and returns their sum.
 * 
 * In the main() method, we create an instance of the Calculator class and call
 * each of the add() methods with different sets of arguments. The compiler
 * knows which version of the add() method to call based on the number and types
 * of arguments that we pass in. The output of the program is:
 */