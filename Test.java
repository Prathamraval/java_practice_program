public class Test { 
	
	static{
		// System.out.println(x); CE: illegal forward reference
		x = 100; // we can write
        
	}
	
	static int x = 200;
    private static final int a=10;

	public static void main(String[] args){

        final boolean flag;
        flag=false;
        while (flag) {
            System.out.println("hello");
        }

        final Test d=null;
        System.out.println(d.a);

        String javaworld = "JavaWorld";

        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java+" "+(java == javaworld));
        String  arr = new String("2");
        String  arr2 = new String("2");
        String  str =  arr.intern();
        String str2 = arr2.intern();
        System.out.println(str==str2);

	}
}