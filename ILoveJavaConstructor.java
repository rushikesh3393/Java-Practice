/* Create a class named 'Programming'. While creating an object of the class, if nothing is
passed to it, then the message "I love programming languages" should be printed. If some
String is passed to it, then in place of "programming languages" the name of that String
variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed. */

import java.util.*;
class Programming
{
	 Programming()
	 {
		  System.out.printf("I love Programming Language");
	 }
	 
	 Programming(String Str)
	 {
		 System.out.printf("I Love %s",Str);
	 }
}

public class ILoveJavaConstructor
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the String");
		String a=xyz.nextLine();
		
		Programming pg=new Programming();
		Programming pg1=new Programming(a);
	}
}
		
		