import java.io.IOException;

public class Demo
{
    private static int age = 23;
    private static Demo demo = new Demo();
    private static String name = "Java";

    public Demo()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args)
    {

        try {
            String name ="E";
            System.out.println(name); 
        }
            catch (IOException exception){
                System.out.println("TOExceptia");
    }
        System.out.println(name);
        System.out.println(age);
    }
}

