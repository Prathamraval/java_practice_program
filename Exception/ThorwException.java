package Exception;

import java.io.IOException;

public class ThorwException {
    
    void m() throws IOException
    {  
        System.out.println("this is m method");
        throw new IOException();//checked exception  
    }  
  
    void n() 
    {  
        System.out.println("this is n method");
        throw new NullPointerException();//unchecked exception no need to use throws   
    }  
  
  void p(){  

   try{  
        m();  
        n();
   }catch(Exception e){
        System.out.println("exception handled");
    }  
  }  
  public static void main(String args[]){  
   ThorwException obj=new ThorwException();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  
