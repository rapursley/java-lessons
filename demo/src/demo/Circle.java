package demo;

public class Circle extends Shape{
	private double radius;

	public Circle() {
		super();
		radius = 1;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double rad) {
		if(rad > 0){
			radius = rad;
		}
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}

	public String toString(){
		return "I am a circle with the radius of " + radius;
	}
	
	public boolean equals(Circle c2){
		return radius == c2.radius;
	}
}
