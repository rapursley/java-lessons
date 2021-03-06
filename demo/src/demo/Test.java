package demo;

class Base {
	static void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}	
}

class Derived extends Base {
	static void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}

public class Test {
	public static void main(String args[]) {
		Base obj1 = new Derived();
		obj1.display();
		obj1.print();
	}
}
	
