package demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is you name?");
		String name = scan.nextLine();
		System.out.println("hello,  "  + name);
		scan.close();
		
		Sample sample = new Sample();
		System.out.println(sample.getWidth());
		sample.setWidth(12.5);
		System.out.println(sample.getWidth());
		System.out.println(sample.length);
		sample.length = 3;
		System.out.println(sample.length);
		
//		System.out.println("hello world!");
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
		
		for ( i = 0; i < args.length; i++) {
		    string = args[i];
			System.out.println(i + " " + string);
		}
		System.out.println(i + " " + string);
	}

	public String toString(){
		return "Hello World!! I am an instance of " + super.toString();
	}
}
