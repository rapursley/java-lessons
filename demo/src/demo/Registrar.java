package demo;

import java.util.ArrayList;
import java.util.Collections;

public class Registrar {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>(); 
		students.add(new Student("Fred", "Edward", "Fitzgerald", 3.12, 65432));
		students.add(new Student("Bob", "S.", "Jones", 3.12, 45983));
		students.add(new Student("Sarah", "Pam", "Fitzgerald", 2.12, 98732));
		students.add(new Student("John", "S.", "Brown", 1.33, 98032));
		students.add(new Student("Tricia", "B", "Millian", 4.00, 65555));
		students.add(new Student("Fred", "Scott", "Fitzgerald", 2.54, 65432));
		students.add(new Student("Wyan", "Morris", "Hickok", 3.33, 98215));
		students.add(new Student("Jane", "Emily", "Austen", 4.00, 98725));
		students.add(new Student("Stephen", "Robert", "King", 3.99, 65432));
		students.add(new Student("Annie", "Phoebe", "Oakley", 3.99, 26261));
		students.add(new Student("Tom", "Bryan", "Jones", 1.49, 82233));
		students.add(new Student("William", "Frederick", "Cody", 2.13, 98725));
		students.add(new Student("Robert", "LeRoy", "Parker", 1.20, 35455));
		students.add(new Student("Martha", "Jane", "Cannary", 3.54, 63453));
		students.add(new Student("Mark", "James", "Twain", 3.56, 23422));
		students.add(new Student("Ernest", "", "Hemingway", 3.56, 23523));
		students.add(new Student("William", "Charles", "Shakespeare", 1.65, 23432));
		students.add(new Student("Charles", "Brett", "Dickens", 4.00, 12342));
		students.add(new Student("Samuel", "Langhorne", "Clements", 3.68, 23434));
		students.add(new Student("Virgina", "Ann", "Woolf", 3.88, 98725));
		 
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
		Collections.sort(students);	//Sort the students ArrayList according to the natural ordering of students.
		System.out.println("-----------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		Collections.sort(students, new ZipCodeComparator());
		//students.sort(new ZipCodeComparator());
		System.out.println("-----------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		Collections.sort(students, new IdComparator());
		System.out.println("-----------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		//search
		System.out.println("-----------------------");
		System.out.println("Searching for Dickens");
		for (Student student : students) {
			if (student.getLastName().equals("Dickens")){
				System.out.println(student);
				break;
			}
		}
		
		
	}

}

