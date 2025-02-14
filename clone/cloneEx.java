package clone;

import java.util.*;

class GFG implements Cloneable {
    int x, y;

    GFG() {
        x = 10;
        y = 20;
    }

    // Overriding the clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}

public class cloneEx {
  
    public static void main(String[] args) 
      throws CloneNotSupportedException {

        Map<String,Person> m = new HashMap<>();


        GFG o1 = new GFG(); 
        
        // Cloning obj1 into obj2
        GFG o2 = (GFG) o1.clone(); 
        o2.x=50;
        System.out.println("o1: " + o1.x + " " + o1.y);
        System.out.println("o2: " + o2.x + " " + o2.y);
        System.out.println(o1.hashCode()+" "+o2.hashCode()); 
    }
}

