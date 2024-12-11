package constructor;

public class ParametrizedConstructor {

	public ParametrizedConstructor(int a, String b) {
		
		System.out.println("You have pssed int: "+ a);
		System.out.println("You have pssed String: "+ b);

	}
	public static void main(String[] args) {
		
		ParametrizedConstructor obj = new ParametrizedConstructor(23, "Talib"); 
	}
}
