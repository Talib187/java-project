package inheritance;

interface demoInherit {
	public void print();

	public abstract void getColor();
}

interface demoInherit1 {
	public void print1();

	public abstract void getColor1();
}

class demoInterface implements demoInherit, demoInherit1 {
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

public class Demoing {

	public static void main(String[] args) {

		demoInterface obj = new demoInterface();

		obj.print();
		obj.getColor();

		obj.print1();
		obj.getColor1();
	}

}
