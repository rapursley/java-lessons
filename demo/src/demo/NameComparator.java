package demo;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
        // Sort students by Last Name, First Name MiddleName
		int firstDiff = s1.getFirstName().compareTo(s2.getFirstName());
		int middleDiff = s1.getMiddleName().compareTo(s2.getMiddleName());
		int lastDiff = s1.getLastName().compareTo(s2.getLastName());
		
		if(lastDiff != 0) {
			return lastDiff;
		} else if(firstDiff != 0) {
			return firstDiff;
		} else {
			return middleDiff;
		}
	}

}
