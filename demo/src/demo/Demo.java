package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		// System.out.println("What is you name?");
		// String name = scan.nextLine();
		// System.out.println("hello, " + name);
		// scan.close();

		Sample sample = new Sample();
		System.out.println(sample.getWidth());
		sample.setWidth(12.5);
		System.out.println(sample.getWidth());
		System.out.println(sample.length);
		sample.length = 3;
		System.out.println(sample.length);

		// System.out.println("hello world!");
		System.out.println(System.out);

		Demo d0 = null;
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = d1;

		System.out.println(d0);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		int i = -1;
		String string = "";

		for (i = 0; i < args.length; i++) {
			string = args[i];
			System.out.println(i + " " + string);
		}
		System.out.println(i + " " + string);

		/* circle */
		Circle c1 = new Circle();
		System.out.println(c1);

		c1 = new Circle(5);
		System.out.println(c1);

		c1.setRadius(7);
		System.out.println(c1);

		Circle c2 = new Circle(7);
		System.out.println("c2: " + c2);

		System.out.println("is c1 == c2? " + (c1 == c2));
		System.out.println("is c1.equals(c2)? " + (c1.equals(c2)));

		String s1 = "ABC";
		String s2 = "abc";
		s2 = s2.toUpperCase();
		System.out.println("is s1 == s2? " + (s1 == s2));
		System.out.println("is s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("=============================================");

		/* Polymorphism */
		Shape shape = new Circle();
		System.out.println(shape);
		shape = new Rectangle();
		System.out.println(shape);
		shape = new Triangle();
		System.out.println(shape);
		Shape[] shapes = new Shape[7];		
		shapes[0] = c1;
		shapes[1] = c2;
		shapes[2] = new Rectangle();
		shapes[3] = new Rectangle(3, 4);
		shapes[4] = new Triangle(2, 8);
		shapes[5] = new Triangle(1, 3);
		shapes[6] = new Triangle(5, 7);
		System.out.println("=============================================");
		System.out.println("shapeList: ");
		ArrayList<Shape> shapeList =  new ArrayList<>(Arrays.asList(shapes));
		System.out.println(shapeList);
		System.out.println("=============================================");
		for (int j = 0; j < shapes.length; j++) {
			shape = shapes[j];
			try {
				if(j > 0) {
					shapes[j].assumeMatch(shapes[j-1]);
					System.out.println("shapes match");
				}
			} catch (ShapeMismatchException e) {
				System.out.println("Exception caught");
				e.printStackTrace();
			}
			if (shape != null) {
				System.out.println(String.valueOf(shape) + " area = " + shape.getArea());
				if(shape instanceof Circle) {
					//Example of casting
					System.out.println(((Circle) shape).getRadius());
				}				
				System.out.println(shape.whoAmI());
			}
		}
		System.out.println("=============================================");
		System.out.println("sorting ... ");
		Arrays.sort(shapes);
		System.out.println("=============================================");

		for (int j = 0; j < shapes.length; j++) {
			shape = shapes[j];
			if (shape != null) {
				System.out.println(String.valueOf(shape) + " area = " + shape.getArea());
				if(shape instanceof Circle) {
					//Example of casting
					System.out.println(((Circle) shape).getRadius());
				}				
				System.out.println(shape.whoAmI());
			}
		}		
		System.out.println("=============================================");
		double d = 1;
//		int i = 1.0;
		Random random = new Random();
		int rand;
		for (int j = 0; j < 10; j++) {
			//Example of casting
			rand = (int)( Math.random() * 10 ) + 1;
			System.out.println("random number1: " + rand);
			rand = random.nextInt(10) + 1;
			System.out.println("random number2: " + rand);
		}			
		System.out.println("=============================================");
		System.out.println("Serializing the shapes array.");
		File file = new File("Shapes.ser");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(shapes);
			System.out.println("Shapes arrya was serialized to " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	public String toString() {
		return "Hello World!! I am an instance of " + super.toString();
	}
}

