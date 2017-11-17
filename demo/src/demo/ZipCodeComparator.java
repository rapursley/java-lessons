package demo;

import java.util.Comparator;

public class ZipCodeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// Compare students by zipcode, smallest to largest.		
		return s1.getZipCode()  - s2.getZipCode();
	}

}
