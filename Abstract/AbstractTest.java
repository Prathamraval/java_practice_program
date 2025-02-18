package Abstract;

abstract class A {
	A(){
		System.out.println("this is abstract class constructor");
	}
//	abstract class can have main method
//	public static void main(String[] args) {
//		System.out.println("this is main method");
//	}
}

class B extends A{
	B(){
		System.out.println("this is B class constructor");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
		A a = new B();	
	}
}