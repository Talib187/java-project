package staticUsage;

public class StaticVariable {

	static int a = 5;
	
	public static  void getData(){
		
		System.out.println("getData Method");
	}
	
	public static void main(String[] args) {
		
		StaticVariable.getData();
		System.out.println(StaticVariable.a);

	}
}
