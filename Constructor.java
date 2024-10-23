public class Constructor
 {
    Constructor()    
	//Default constructor
    {
        System.out.println("Default constructor");
    }
    Constructor(int a, String name) 
	// Parameterized constructor
    {
        System.out.println("The constructor with two parameters INTEGER and STRING, the values are "+ a+ ", " +name);
    }
    Constructor(boolean x)
    {
        this(7, "pratham");
        System.out.println("the statement is "+x);
    }
    public static void main(String []args)
	{
        Constructor obj= new Constructor();
        Constructor obj1= new Constructor(8,"pratham");
        Constructor obj2= new Constructor(true);
	}
}
