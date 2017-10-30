package demo;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		ArrayList<Integer> integers = new ArrayList<>();
		
		strings.add("Hello World!");
		strings.add("How are you today?");
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		integers.add(1);
		integers.add(2);
		integers.add(3);
		
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(new Rectangle());
		shapes.add(new Rectangle(3, 4));
		shapes.add(new Triangle(2, 8));
		shapes.add(new Triangle(1, 3));
		shapes.add(new Triangle(5, 7));
		
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}
