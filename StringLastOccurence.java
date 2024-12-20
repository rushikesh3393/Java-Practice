/* 15.Write a JAVA program to find last occurrence of a character in a given string. */ 

import java.util.*;
public class StringLastOccurence
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
		
		int start=s.length()-1;
		
		for(int i=start; i>=0;i--)
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