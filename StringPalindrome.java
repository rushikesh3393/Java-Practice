/* 12. Write a JAVA program to check whether a string is palindrome or not. */

import java.util.*;
public class StringPalindrome
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the String");
		String s=xyz.nextLine();
		
		char str[]=s.toCharArray();
		
		
		int start=0;
		int end=str.length-1;
		
		while(start<end)
		{
			char c     = str[start];
			str[start] =str[end];
		    str[end]   =c;
		 	
			start++;
			end--;
		}
		
		 String sp= new String(str);
		 
		 if(s.equals(sp))
		 {
			 
		   System.out.printf("\n The String Is PALINDROME");
		 }
		 else
		 {
			 System.out.printf("\n The String Is NOT PALINDROME");
		 }
	}
}