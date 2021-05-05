package userDefinedEqualsAndHashCode;


import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestDuplicates {
	
	public static void main(String[] args) {
		
		StudentsInfo student1 = new StudentsInfo(1, "ABC" , 0.8);
		StudentsInfo student2 = new StudentsInfo(2, "PQR" , 0.7);
		StudentsInfo student3 = new StudentsInfo(3, "XYZ" , 0.85);
		StudentsInfo student4 = new StudentsInfo(1, "ABC" , 0.8);	// duplicate object
		StudentsInfo student5 = new StudentsInfo(1, "STU" , 0.9);	// same id
		StudentsInfo student6 = new StudentsInfo(4, "ABC" , 0.8);	// different id but same details
		
		Set <StudentsInfo> students = new HashSet<StudentsInfo>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		
		Iterator <StudentsInfo> itr = students.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
