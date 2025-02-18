package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList(); 
  
        list.add(0, "Pratham");
        list.add("raval");
        list.add(2, "sanjay");
        list.add(0,"shaym");
        System.out.println("The list is: " + list); 
        System.out.println(list.indexOf("Pratham"));

        System.out.println(list.contains("Pratham"));
        System.out.println("size : "+list.size()); 


        Set<String> set = new HashSet<String>();
        set.add(null);
        set.add("pratham");
        System.out.println(set);
    }
}
