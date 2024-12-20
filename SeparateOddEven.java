/*  2)	 Write a program in java to separate odd and even integers in separate arrays ?  */

import java.util.*;
public class SeparateOddEven
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Number of elements Stored in Array:\n");
		int size1=xyz.nextInt();
		
		int a[]=new int[size1];
		
		System.out.printf(" Enter the Elements of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.printf("\nEven Elements Are:\n");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.printf("%d \t",a[i]);
			}
		}
		
		System.out.printf("\n odd Elements Are:\n");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.printf("%d \t",a[i]);
			}
		}
	}
}
			
		
		