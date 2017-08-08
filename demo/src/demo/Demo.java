package demo;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("hello world!");
		System.out.println(System.out);
		
		Demo d0 = null;
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = d1;

		System.out.println(d0);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

	public String toString(){
		return "Hello World!! I am an instance of " + super.toString();
	}
}
