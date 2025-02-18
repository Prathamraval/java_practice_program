package Exception;
import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
    public void m1() throws IOException {   // here only can be parent 
        System.out.println("Base: m1()");
        throw new FileNotFoundException();
    }
}

class Derived extends Base {
    public void m1() throws FileNotFoundException { // only can be sub exception of base class
        System.out.println("Derived: m1()");
        throw new FileNotFoundException();
    }
}

public class ThrowsExampleWithOverriding {
    public static void main(String[] args) {
        Base obj = new Derived();

        try {
        	obj.m1();
        }
        catch(IOException e){
            System.out.println("this is ioexception");
        }
        catch (Exception e) {
        }
    }
}