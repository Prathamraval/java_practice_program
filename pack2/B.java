package pack2;

import pack1.A;

public class B extends A {
    int i2=50;
    public void print() {
        B obj = new B();
        A a =new A();
        System.out.println(obj.x);
        // System.out.println(a.i2); //Line 8
        System.out.println(i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

    public static void main(String [] args) {

        System.out.println(new B().i2);
        new B().print();;
    }
}
