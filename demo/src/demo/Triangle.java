package demo;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	public Triangle() {
		super();
		this.base = 1;
		this.height = 1;
	}
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	

	@Override
	public double getArea() {
		// TODO Auto-generated method stubs
		return .5 * base * height;
	}
	
	public String toString(){
		return "I am a triangle with a base of " + base + ", height of " + height + " and an area of " + getArea();
	}

	public String whoAmI() {		
		return "I am a triangle, which is a subclass of " + super.whoAmI();
	}
}
