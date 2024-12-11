package staticUsage;

public class StaticMethod {

	 static int a = 98;
	public static void getResult() {
		
		System.out.println("This is static method: "+a);
	}
	
	public static void main(String[] args) {
		
		StaticMethod.getResult();
		
	}
}
//Static methods can be called using the class name, without creating an instance of the class.
//Static methods cannot non static variables 