package Polymorphism;

public class MethodOverloading {

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println(a + b + c);
	}

	public void add(double a, double b) {

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.add(10, 20);
		m.add(20, 30, 40);
		m.add(5.5, 2.1);
	}
}
