package constructor;

public class ConstructorDefault {

    // No explicit constructor defined
	int a;
	String str;
	boolean result;
	
	public static void main(String[] args) {
		ConstructorDefault obj = new ConstructorDefault();

		System.out.println(obj.a);
		System.out.println(obj.str);
		System.out.println(obj.result);
		
	}
}
