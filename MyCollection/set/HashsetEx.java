package MyCollection.set;

import java.util.HashSet;
import java.util.Set;

public class HashsetEx {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        System.out.println(set);


        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person(1,"Pratham"));   // when equals and hashcode function is not overridden in person it will store both copy of same object content 
        persons.add(new Person(1,"Pratham"));   // when both methods are overridden then it will allow only one object to store 
        persons.add(new Person(2,"Vidhi")); 
        System.out.println(persons);

        System.out.println("----------------");
        Person p1= new Person(1,"pratham");
        Person p2= new Person(1,"pratham");
        System.out.println("p1 is instance of object :"+p1 instanceof Object);
        System.out.println(p1.equals(p2));          // here equals method is overridden that's why it's giving true otherwise it is uses Object class's equals method then it will give false
        System.out.println(p1.hashCode()+" "+p2.hashCode()); 
    }
}
