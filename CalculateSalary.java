import java.util.Scanner; 
 class CalculateSalary
{
	public static void calcProcess(int sal,String name, int no)
	{
		double DA, HRA, PF, gross, net; int CCA=240, PT=100;	

		HRA=(0.3*sal);	
		DA=(0.7*sal);
		PF=(0.1*sal);
		gross = (sal + HRA + DA + CCA + PF + PT);
		net=(gross-(CCA+PT+PF)); 
		System.out.println(); 
		System.out.println("The DA is : " + DA); 
		System.out.println("The HRA is : " + HRA); 
		System.out.println("The CCA is : " + CCA); 
		System.out.println("The PF is : " + PF); 
		System.out.println("The PT is : " + PT);
		System.out.println("The gross and net salary of " + name + " with employee number : " + no + " is : "); 
		System.out.println("Gross = " + gross); 
		System.out.println("Net = " + net);
	}

public static void main (String args[])
{
	Scanner scanner = new Scanner(System.in); 
	boolean quit = false;
	while(!quit)
	{
		int n; 
		System.out.println();
		System.out.println("Please select an option from below :");
		System.out.println("1. Enter employee details\n2.Quit");
		System.out.println("Enter the option selected : "); 
		n=scanner.nextInt();
		System.out.println();

		switch(n)
		{
			case 1 : 
				int empno, basic; 
				String empname;
				Scanner sc = new Scanner(System.in); 
				System.out.println("Enter employee name : ");
				empname=sc.nextLine();
				System.out.println("Enter employee number :");
				empno=sc.nextInt();
				System.out.println("Enter the basic salary of " + empname + " : ");
				basic=sc.nextInt(); 
				calcProcess(basic,empname,empno); 
				break;


			case 2 : 
			quit=true; 
			System.out.println("Program Quit Successfully.");
			break;

			default : System.out.println("Invalid choice.");
		}
	}
	}
}