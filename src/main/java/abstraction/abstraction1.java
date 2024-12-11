package abstraction;

abstract class kiaCar {
	public int getWheels() {
		return 4;
	}

	abstract String getColor();
}

class Carnival extends kiaCar {

	@Override
	String getColor() {
		return "Blue";
	}

}

public class abstraction1 {
	public static void main(String[] args) {

		Carnival obj = new Carnival();

		System.out.println(obj.getColor());
		System.out.println(obj.getWheels());
	}
}