package demo;

public class C extends B {
	@Override
	public String toString() {
		return "in C's toString, super.toString() returns: " + super.toString();
	}
}
