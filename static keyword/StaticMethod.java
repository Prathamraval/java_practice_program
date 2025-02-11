class StaticExample {

    public static void method1() {
        System.out.println("This is static method1 call");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        StaticExample.method1();  // static method is part of class rather than an instance of that class.
    }
    
}