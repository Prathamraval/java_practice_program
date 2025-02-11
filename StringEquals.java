public class StringEquals {
    
    public static void main(String[] args) {
        String str = "Pratham";  
        String str2 = "Pratham";    //points to address as str points 
        String str3 = new String("Pratham");
    
        System.out.println(str==str2);  // compare the address instead of content of object
        System.out.println(str==str3);  // it gives false because both object points different address and == compares address and both have same content 
        System.out.println(str.equals(str3));   // equals method compares content of the object, it gives true 
        System.out.println(str instanceof String);
        System.out.println(str.hashCode());   //str  and str2 have same address
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str3));  //str3  creates new object which refers new address 
        str=str2.concat(str3);
        System.out.println(str);
    }

}
