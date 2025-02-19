package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Pratham"));
		students.add(new Student(3, "Nikul"));
		students.add(new Student(2, "Sanajay"));
		students.add(new Student(4, "Vidhi"));
	
		System.out.println(students);
		Collections.sort(students);	//it gives an error for object is not comparable 
		System.out.println("After sort:");
		System.out.println(students);
	}
}
