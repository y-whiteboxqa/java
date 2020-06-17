package Inheritance;


public class Math implements Addition,Subtraction{

	//multiple inheritance using interface
	
		public void add() {

			System.out.println(20 + 10);
		}

		public void subtract() {

			System.out.println(20 - 10);
		}

		public static void main(String[] args) {

			Math obj = new Math();
			obj.add();
			obj.subtract();

		}
}
