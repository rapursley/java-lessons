package demo;

public abstract class Shape implements Comparable<Shape> {
	
	public abstract double getArea();
	
	public String whoAmI() {		
		return "Shape"; //"I am a Shape who is a subclass of " + super.toString(); 
	}
	
	public void assumeMatch(Shape otherShape) throws ShapeMismatchException {
		String s1 = this.getClass().getName();
		String s2 = otherShape.getClass().getName();
		if(!s1.equals(s2)) throw new ShapeMismatchException(s1 + " doesn't match " + s2 + " \n");			

		
	}
	
	@Override
	public int compareTo(Shape otherShape) { 
		/*
		String s1 = this.getClass().getName();
		String s2 = otherShape.getClass().getName();
		try {
			if(!s1.equals(s2)) throw new ShapeMismatchException(s1 + " doesn't match " + s2 + " \n");			
		} catch (ShapeMismatchException e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		*/
		//Sort large to small
//		return (int)(otherShape.getArea() - this.getArea()); 
		//sort small to large
		return (int)(this.getArea() - otherShape.getArea()); 

	}

}
