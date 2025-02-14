package Collection.map;

import java.util.HashMap;
import java.util.Map;

import Collection.set.Person;

public class HashMapx {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("aaa", 1);
        map.put("aaa", 2);
        map.put("ccc", 1);

        System.out.println(map);

        // Person p1 = new Person(1,"pratham");
        // Person p2 = new Person(1,"pratham");
        // System.out.println(p1.hashCode()+" "+p2.hashCode());
        // Map<Person,Integer> hashmap = new HashMap<>();
        // hashmap.put(p1, 1);
        // hashmap.put(p2, 1);
        // System.out.println(hashmap);
    }
}
