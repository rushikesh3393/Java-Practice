/* Write a program to calculate sum of digits located in String.
Input - 10 variables 53 keywords 123 literals 978 programs.
Output – 1164 */

import java.util.*;

public class TesttSecOneSecond
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=xyz.nextLine();
		
		
		String s[]=str.split(" ");
		int sum=0;
		
		int a=0;
		
		for(int i=0;i<s.length;i++)
		{
			try
			{
				
		    a=Integer.parseInt(s[i]);
			sum=sum+a;
			}
			catch(Exception ex)
			{
				System.out.println("Error is:"+ex);
			}
			
		}
		
		System.out.printf("The sum from String is:%d",sum);
	}
}
		
		