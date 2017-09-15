package demo;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle() {
		super();
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
	
	public String toString(){
		return "I am a rectangle with a length of " + length + " and width of " + width + " and an area of " + getArea();
	}

	public String whoAmI() {		
		return "I am a rectangle, which is a subclass of " + super.whoAmI();
	}

}
