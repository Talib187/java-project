package javaCoding;

public class ConstructorDemo {

	public ConstructorDemo() {  // Default constructor
		
		System.out.println("This is default constructor");
	}
	
	public ConstructorDemo(int num) { // Parametrized constructor
		
		System.out.println("This is parametrized constructor: " + num);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo();  // Object of the class is created here not of the method.
		ConstructorDemo obj1 = new ConstructorDemo(55);
	}
}
// Above is also example of constructor overloading.