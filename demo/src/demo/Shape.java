package demo;

public abstract class Shape implements Comparable<Shape> {
	public abstract double getArea();
	
	public String whoAmI() {		
		return "Shape"; //"I am a Shape who is a subclass of " + super.toString(); 
	}
	
	@Override
	public int compareTo(Shape otherShape) {
		return (int)(otherShape.getArea() - this.getArea()); 
	}

}
