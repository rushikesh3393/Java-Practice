/*  1)	Write a program in java to merge two arrays of same size sorted in decending order.  */

import java.util.*;
public class MergeArrayAsg
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Number of elements Stored in First Array:");
		int size1=xyz.nextInt();
		
		System.out.printf("Number of elements Stored in Second Array:");
		int size2=xyz.nextInt();
		
		int a[]=new int[size1];
		int b[]=new int[size2];
		int c[]=new int[size1+size2];
		
		System.out.printf("Enter the Elements of First Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.printf("Enter the Elements of Second Array:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) 
		{
            c[i + a.length] = b[i];
        }
        
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]>c[i])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		System.out.printf("Descending Array is:");
		for(int i=0;i<c.length;i++)
		{ 
	        System.out.printf("%d \t",c[i]);
		}
	}
}
		