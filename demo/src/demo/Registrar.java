package demo;

import java.util.ArrayList;

public class Registrar {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>(); 
		students.add(new Student("Fred", "Scot", "Fitzgerald", 3.123, 65432));
		students.add(new Student("Bob", "S.", "Jones", 3.123, 45983));
		students.add(new Student("Sarah", "Pam", "Fitzgerald", 2.123, 98732));
		students.add(new Student("John", "S.", "Brown", 1.334, 98032));
		students.add(new Student("Tricia", "B", "Millian", 4.00, 65555));
		students.add(new Student("Fred", "Scott", "Fitzgerald", 2.543, 65432));
		System.out.println(students);
		for (Student student : students) {
			System.out.println(student);
		}
		students.sort(new NameComparator());
		System.out.println("-----------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		students.sort(new ZipCodeComparator());
		System.out.println("-----------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}

