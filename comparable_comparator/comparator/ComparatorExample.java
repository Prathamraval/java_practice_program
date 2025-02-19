package comparable_comparator.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp(1, "Pratham", "1234567"));
		emps.add(new Emp(3, "Sanjay", "2345678"));
		emps.add(new Emp(4, "Vidhi", "0987654"));
		emps.add(new Emp(2, "Nikul", "1237890"));
		
		System.out.println(emps);
		Collections.sort(emps,new NameComparator());
		System.out.println("After sort by name:");
		System.out.println(emps);
	}
}
