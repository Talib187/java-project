package staticUsage;

public class StaticBlock {

	static {

		System.out.println("This is static block");
	}

	public static void getResult() {

		System.out.println("This is getResult Method");
	}

	public static void main(String[] args) {

		System.out.println("Print form main method");
		getResult();
	}
}
// As you can see int the example
// First static block is executed then main method and then getResult method.