class A{

}
class B extends A{

    B(int i){

    }
    B(){
        System.out.println("this is from B");
    }
}
class C extends B{
    
    C(int i){
        super(i);
        System.out.println(i);
    }
}
public class Super {
    public static void main(String[] args) {
        C obj = new C(10);        
    }
}
