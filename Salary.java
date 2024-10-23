import java.util.*;
class Salary
     {
		 public static void main(String[]args)
		 {
			 String empname;
			 double empno,basic,da,hra,pf,cca=240,pt=100,gross_salary;
			 Scanner in=new Scanner(System.in);
			 System.out.println("Enter Employee name:-");
			 empname=in.nextLine();
			 System.out.println("Enter Employee no:-");
			 empno=in.nextInt();
			 System.out.println("Enter basic salary:-");
			 basic=in.nextInt();
			 da=0.7*basic;
			 hra=0.3*basic;
			 gross_salary=da+hra+basic-cca-pt;
			 System.out.println("Employee name: "+empname);
			 System.out.println("Employee no : "+empno);
			 System.out.println("Basic : "+basic);
			 System.out.println("DA : "+da);
			 System.out.println("HRA : "+hra);
			 System.out.println("CCA : "+cca);
			 System.out.println("PT : "+pt);
			 System.out.println("Gross salary: "+gross_salary);
			 
		 }
	 }
