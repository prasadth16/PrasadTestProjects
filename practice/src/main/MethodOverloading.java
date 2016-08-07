package main;

public class MethodOverloading {

	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] a) {
		MethodOverloading m1 = new MethodOverloading();
		System.out.println(m1.add(15.7, 23.8));
		System.out.println(m1.add(12, 8));
	}

	public static void main(int a) {
		System.out.println(a);
	}
}
