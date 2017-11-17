package demo;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// Compare students by studetId, smallest to largest.		
		return s1.getStudentId()  - s2.getStudentId();
	}

}
