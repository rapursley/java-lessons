package demo;

public class TestABC {

	public static void main(String[] args) {
		A[] as = new A[3];
		as[0] = new A();
		as[1] = new B();
		as[2] = new C();
		
		for (A a : as) {
			System.out.println(a);
		}
	}

}
