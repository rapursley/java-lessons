package demo;

public class Student implements Comparable<Student> {

	private String firstName;
	private String middleName;
	private String lastName;
	private int studentId;
	private static int counter = 1;
	private double gpa;
	private int zipCode;
	
	public Student(String firstName, String middleName, String lastName, double gpa, int zipCode) {
		super();
		this.studentId = counter++;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.zipCode = zipCode;
	}


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public static int getCounter() {
		return counter;
	}



	public static void setCounter(int counter) {
		Student.counter = counter;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	public int getZipCode() {
		return zipCode;
	}



	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}



	public int getStudentId() {
		return studentId;
	}



	@Override 
	public int compareTo(Student o) {
		// Natural ordering will be sort by GPA descending
		// Multiply by 1000 so that our difference when 
		// cast to an int will compare to the 3rd decimal place of gpa.
		return (int)((o.gpa * 1000) - (this.gpa * 1000));
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", studentId=" + studentId + ", gpa=" + gpa + ", zipCode=" + zipCode + "]";
	}
	
	
}
