package abstraction;

abstract class marutiCar {

	public int wheels() {
		return 4;
	}
	abstract public String color();
	abstract public long price();
	abstract public int seat();
}
	 class VagonR extends marutiCar{

		@Override
		public String color() {
			// TODO Auto-generated method stub
			return "Black";
		}

		@Override
		public long price() {
			// TODO Auto-generated method stub
			return 4234;
		}

		@Override
		public int seat() {
			// TODO Auto-generated method stub
			return 7;
		}
		
	
	 

	public static void main(String[] args) {
		
		VagonR obj   = new VagonR();
		System.out.println(obj.price());
	}
}
