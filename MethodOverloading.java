public class MethodOverloading 
{
    public static void main(String []args)
	{
        System.out.println("The value of inches to centimeters is " +convertToCentimeters(10));
        System.out.println("The value of feet and inches to centimeter "+convertToCentimeters(12,18));

    }
    public static double convertToCentimeters(int xInches)
	  {
        return 2.54*xInches;
      }
    public static double convertToCentimeters(int yFeet,int xInches)
	{
        double newInches= 12*yFeet;
        newInches +=xInches;
        return convertToCentimeters((int) newInches);
    }
}
