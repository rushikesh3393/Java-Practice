/* 11.Write a JAVA program to find reverse of a string. */
import java.util.*;
public class StringReverse
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
		
		 s= new String(str);
		
		System.out.printf("\n The String After Reverse OPEration is:%s",s);
	}
}