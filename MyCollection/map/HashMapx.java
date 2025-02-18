package MyCollection.map; 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapx {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("aaa", 10);
        map.put("bbb", 20);
        map.put("ccc", 30);
        map.put("ddd", 40);
        map.put("eee", 10);
        map.put("fff", 20);
        map.put("ggg", 30);
        map.put("hhh", 40);
        map.put("iii", 10);
        map.put("jjj", 20);
        map.put("kkk", 30);
        map.put("lll", 40);
        
        System.out.println(map);
        System.out.println(map.get(null));
        
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
        	String key = itr.next();
        	System.out.println(map.get(key));
        }
        
        // Person p1 = new Person(1,"pratham");
        // Person p2 = new Person(1,"pratham");
        // System.out.println(p1.hashCode()+" "+p2.hashCode());
        // Map<Person,Integer> hashmap = new HashMap<>();
        // hashmap.put(p1, 1);
        // hashmap.put(p2, 1);
        // System.out.println(hashmap);
    }
}
