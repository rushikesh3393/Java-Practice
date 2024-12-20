/* 10.Write a JAVA program to count total number of words in a string.  */

import java.util.*;
public class StringTotalNoWords
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter The String");
		String s=xyz.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		
		System.out.printf("Total number of Words Are:%d",count+1);
	}
}