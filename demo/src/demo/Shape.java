package demo;

public abstract class Shape {
	public abstract double getArea();
	
	public String whoAmI() {		
		return "Shape"; //"I am a Shape who is a subclass of " + super.toString(); 
	}

}
