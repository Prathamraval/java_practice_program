class StaticExample {
    int i;
    public static void method1(StaticExample obj) {
        System.out.println(obj.i);
        System.out.println("This is static method1 call");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        obj.method1(obj);  // static method is part of class rather than an instance of that class.
    }
    
}