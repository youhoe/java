//String to int using Integer.parseInt(String) 
class string1
{
public static void main(String args[])
{
String str="123"; int inum = 100;
int inum2 = Integer.parseInt(str); int sum = inum+inum2;
System.out.println("Result is: "+sum);
}
}
=======================
//string functions class string2
{
public static void main(String[] args)
{
String targetString = "Java is easy to learn"; String s1= "JAVA";
String s2= "Java";
String s3 = " Hello Java ";
System.out.println("Char at index 2(third position): " + targetString.charAt(2));
System.out.println("After Concat: "+ targetString.concat(" and Enjoy"));
System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
System.out.println("Checking equals with case: " +s2.equals(s1));
System.out.println("Checking Length: "+ targetString.length());
System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
System.out.println("SubString of targetString: "+ targetString.substring(8));
System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
System.out.println("Converting to lower case: "+ targetString.toLowerCase());
System.out.println("Converting to upper case: "+ targetString.toUpperCase());
System.out.println("Triming string: " +s3.trim());
System.out.println("searching s1 in targetString: " + targetString.contains(s1));
System.out.println("searching s2 in targetString: " + targetString.contains(s2));
char [] charArray = s2.toCharArray(); System.out.println("Size of char array: " +
charArray.length);
System.out.println("Printing last element of array: " + charArray[3]);
}
}
============
//palindrome string class string3
{
public static void main(String args[])
{
String palindrome = "Hey yeh"; int len = palindrome.length();
System.out.println( "String Length is : " + len );
}
}
================
//character position class string4
{
public static void main(String[] args)
{
String str_Sample = "RockStar"; System.out.println("Character at position 5: " +
str_Sample.charAt(5));
System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
}
}

=============
//Lowercase and Uppercase class string5
{
public static void main(String[] args)
{
String str_Sample = "Chandrayaan"; System.out.println("Convert to LowerCase: " +
str_Sample.toLowerCase()); System.out.println("Convert to UpperCase: " +
str_Sample.toUpperCase());
}
}
==========================
//string handling 
class string6
{
public static void main(String args[])
{
int n;
String s = "Java programming", t = "", u = ""; System.out.println(s);
n = s.length();
System.out.println("Number of characters = " + n); t = s.replace("Java", "C++");
System.out.println(s); System.out.println(t); u = s.concat(" is fun"); System.out.println(s); System.out.println(u);
}
}
================
//string concat class string7
{
public static void main(String arg[])
{
String s1="Aarna"; String s2="Bafna";
System.out.println("Combined String: "+s1.concat(s2));
}
}

=====================
//string compare class string8
{
public static void main(String arg[])
{
String s1="Aarna"; String s2="Bafna"; String s3="Aarna";
System.out.println("Compare String: "+s1.equals(s2));
System.out.println("Compare String: "+s1.equals(s3));
}
}
======================
//string compare class string9
{
public static void main(String arg[])
{
String s1="Aarna"; String s2="AARNA"; String s3="Bafna";
System.out.println("Compare String: "+s1.equalsIgnoreCase(s2));
System.out.println("Compare String: "+s1.equalsIgnoreCase(s3));
}
}
==================
class string10
{
public static void main(String arg[])
{
String s1="Aarna"; String s2="Bafna"; int i; i=s1.compareTo(s2); if(i==0)
{
System.out.println("Strings are
same");
}
else
{
System.out.println("Strings are not
same");
}
}
}

