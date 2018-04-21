package demo;

public class B extends A {
	@Override
	public String toString() {
		return "in B's toString, super.toString() returns: " + super.toString();
	}
}
