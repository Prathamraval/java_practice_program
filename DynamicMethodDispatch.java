class A{
    int i=10;
    void method(){
        System.out.println("This is A method");
    }
}
class B extends A{
    int i=30;
    void method(){
        System.out.println("This is B method");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a= new B();
        a.method();
        System.out.println("i= "+a.i);
    }
}
