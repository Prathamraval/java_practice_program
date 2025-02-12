package protectedkeyword.Package2;

import protectedkeyword.package1.Parent;

public class child extends Parent{
    public void display() {
        System.out.println("x = " + this.x);  // Accessing protected member directly in subclass from another package
    }
    public static void main(String[] args) {
        child c = new child();
        Parent p = new Parent();
        c.x=2;

        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));

    }

}
