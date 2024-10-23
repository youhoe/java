import java.util.*; 
class Vector { 
    public static void main(String[] arg) 
    { 
  
        // create default vector 
        Vector v = new Vector(); 
  
        v.add(0, 1); 
        v.add(1, 2); 
        v.add(2, "Java"); 
        v.add(3, "forBegineers"); 
        v.add(4, 3); 
  
        System.out.println("Vector is " + v); 
    } 
}