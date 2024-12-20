/* 16.Write a JAVA program to search all occurrences of a character in given string. */


import java.util.*;
public class import java.util.*;
public class StringAllOccurence
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the String:");
		String s=xyz.nextLine();
		
		System.out.printf("Enter the Charcter");
		char c=xyz.nextLine().charAt(0);
		
		boolean flag=false;
		int k=-1;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
			    k=i;
				flag=true;
				break;
			}
			
		}
	
	    if(flag==true)
		{
     		System.out.printf("First Occurence of character  at index :%d",k);
		}
		else
		{
			System.out.printf("Character NOT FOUND");
		}
	}
}
			
				

{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the String:");
		String s=xyz.nextLine();
		
		System.out.printf("Enter the Charcter");
		char c=xyz.nextLine().charAt(0);
		
		boolean flag=false;
		int k=-1;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
			    k=i;
				flag=true;
				break;
			}
			
		}
	
	    if(flag==true)
		{
     		System.out.printf("First Occurence of character  at index :%d",k);
		}
		else
		{
			System.out.printf("Character NOT FOUND");
		}
	}
}
			
				
