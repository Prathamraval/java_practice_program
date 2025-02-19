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
            catch (Exception exception){ // here if ioexception used then it will give error
                System.out.println("TOExceptia");
            }
  
        System.out.println(name);
        System.out.println(age);
    }
}

