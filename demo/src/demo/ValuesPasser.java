package demo;
// This is relavent to oca 6.8 objective
public class ValuesPasser {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		passX(x);
		System.out.println(x);
		
		Circle c1 = new Circle();
		System.out.println(c1);
		
		Circle c2 = new Circle(5);
		System.out.println(c2);
		
		passCircles(c1, c2);
		System.out.println(c1);
		System.out.println(c2);
		
	}

	private static void passCircles(Circle c1, Circle c2) {
		c1 = c2;
		c2.setRadius(7);
		System.out.println(c1);
		System.out.println(c2);
		
	}

	private static void passX(int x) {
		System.out.println(x);
		x++;
		System.out.println(x);
	}

}
