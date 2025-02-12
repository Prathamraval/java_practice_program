class Super{
    protected void method() throws NullPointerException{    // we can use throws with one limitation that child class can only have subcass of super class throws declaration 
        System.out.println("This is super method");
    }
} 
class Child extends Super{
    public  void method(){  // here private,default will give error 
        System.out.println("This is child method");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Super s = new Child();
        s.method();
    }
}
