package abstraction;

interface demoInherit {

//	private int a = 4;
	public void print();

	  void getColor();
}

interface demoInherit1 {
	public void print();

	public void getColor1();
}

class demoInterface implements demoInherit, demoInherit1 { // multiple inheritance using inteface.
	@Override
	public void print() {
		System.out.println("Print statement");
	}

	@Override
	public void getColor() {

		System.out.println("Color is Red");
	}

	public void print1() {
		System.out.println("Print statement 1");
	}

	@Override
	public void getColor1() {

		System.out.println("Color is Red 1");
	}

}

public class multiLevelInheritanceUsingInterface {

	public static void main(String[] args) {

		demoInterface obj = new demoInterface();

		obj.print();
		obj.print1();
		obj.getColor();
		obj.getColor1();

	}
}
