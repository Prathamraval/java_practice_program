class StaticExample {
    int var1=0;
    static int var2 =0;

    StaticExample(){
        var1++;
        var2++;
    }
    public static void method1() {
        System.out.println("Number of objects created Var2="+var2);  //cannot access non-stastic variable inside static method
    }
        public void printVar1() {
            System.out.println("Var1 for obj ="+var1);
        }
    }
    
    public class StaticField {
        public static void main(String[] args) {
            StaticExample obj1 = new StaticExample();
            obj1.printVar1();
            StaticExample.method1();
            StaticExample obj2 = new StaticExample();
            obj2.printVar1();
            StaticExample.method1();
    }
   
}