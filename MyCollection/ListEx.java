package MyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
        List<Integer> listInt = new ArrayList();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(10);
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(10);
        listInt.add(10);
        listInt.add(10);
        
        list.addAll(listInt);	// if i am not using generic at list object then it will merge both string and integer list 
        System.out.println(list); 	// but if i am using generic with list it will not allow me to merge 
        listInt.remove(0);
        System.out.println(listInt);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers);
    }
}
