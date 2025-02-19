package MyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import comparable_comparator.Student;

public class ListEx {

    public static void main(String[] args) {
    	
        List list = new ArrayList(); 
  
        list.add(0, "Pratham");
        list.add("raval");
        list.add(2, "sanjay");
        list.add(0,"shaym");	// this will be inserted at 0th index and rest will be shifted 
        System.out.println("The list is: " + list); 
        System.out.println(list.indexOf("Pratham"));
        
        System.out.println(list.contains("Pratham"));
        System.out.println("size : "+list.size()); 
        
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        list.set(0, "Vidhi");
        System.out.println("After set: "+list);
        
        System.out.println("get index 1 :"+list.get(1));
        
        System.out.println("--------------");
        
      
        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(50);
        listInt.add(60);
        listInt.add(70);
        listInt.add(80);
        listInt.add(90);
        listInt.add(100);
        listInt.add(110);
        listInt.add(120);
        listInt.add(130);
        listInt.add(140);
        listInt.add(150);
        listInt.add(160);
        
        list.addAll(listInt);	// if i am not using generic at list object then it will merge both string and integer list 
        System.out.println(list); 	// but if i am using generic with list it will not allow me to merge 
        
        listInt.remove(0);	// it takes index instead of object if 100 is used it will give exception java.lang.IndexOutOfBoundsException
       //	list.remove(index) returns deleted item
       //	list.remove(object) returns boolean
        
        System.out.println(listInt);
        System.out.println("indexof 100 :"+listInt.indexOf(100));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers);
        
        
        
        ListIterator<Integer> listIterator = listInt.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
 
        // Traversing elements, the iterator is at the end
        // at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        List<String> dryFruits = new ArrayList<>();
        String walnut = new String("Walnut");
        System.out.println("walnut hashcode:"+walnut.hashCode());
        
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");
//        System.out.println("hashcode "+new String("Walnut").hashCode()+" "+dryFruits.remove(new String("Walnut")));
 // here it will remove using new string("Walnut") because string class overrides equals method but when we use user defined class without overriding object class's equals method it will not remove item
       
        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
                iterator.remove();
//                dryFruits.remove(dryFruit);	 not used it gives ConcurrentModificationException
            }
        }
        System.out.println(dryFruits);

        List<Student> students = new ArrayList<>();
        students.add(new Student(25,"James"));
        students.add(new Student(27,"James"));
        students.add(new Student(25,"James"));
        students.add(new Student(25,"James"));

        System.out.println(students.remove(new Student(25,"James")));	// here it  will not remove because we have not override equals() of object class 

        
        System.out.println("-----------------");

        ArrayList obj1 = new ArrayList();
        ArrayList obj2 = new ArrayList();
        obj1.add("A");
        obj1.add("B");
        obj2.add("A");
        obj2.add(1, "B");
        System.out.println(obj1.equals(obj2));

    }
}
