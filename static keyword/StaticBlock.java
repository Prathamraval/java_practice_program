public class StaticBlock {

    public StaticBlock()
    {
        System.out.println("Inside constructor");
    }
    static   {
        System.out.println("Inside instance initializer2 ");
    }
    static   {
        System.out.println("Inside instance initializer");
    }

    public static void main(String[] args) {
        // new Main();
    }
}

