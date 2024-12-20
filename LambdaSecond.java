/* 2. Write a Java program to implement a lambda expression to check if a given string is empty. */
import java.util.*;
interface Abc
{
	void Check(String str);
}

public class LambdaSecond
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String s=xyz.nextLine();
		
		Abc a=(String str)->{
				boolean b=str.isEmpty();
				
				if(b)
				{
					System.out.println("The String is Empty");
				}
				
				else
				{
					System.out.println("The String is Not Empty");
				}
			};
		
		
		a.Check(s);
	}
}
					
	


	