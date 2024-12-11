package polymorphism;

public  class Demo {

	public void getColor(String color) {
		
		System.out.println("Passed color is: " +color );
	}
	
	public void getColor(int colorCode) {
		
		System.out.println("Passed color code is: " +colorCode+ " and this color code stands for Blue ");
	}
	
	public void getColor(double colorCodeDecimal) {
		
		System.out.println("Passed color code in decimal is :" + colorCodeDecimal + " and this stands for the Black");
	}
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		
		obj.getColor("Green");
		obj.getColor(234);
		obj.getColor(34.33);
		
	}
}
