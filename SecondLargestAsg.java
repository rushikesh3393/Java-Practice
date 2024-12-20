/* 4)	Write a program in java to find the second largest element in an array ? */
import java.util.*;
public class SecondLargestAsg
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Number of elements Stored in Array:\n");
		int size=xyz.nextInt();
		
		int a[]=new int[size];
		
		System.out.printf(" Enter the Elements of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		int max=a[0];
		int secmax=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
			    secmax=max;
				max=a[i];
			
			}
			if(a[i]>secmax && a[i]<max)
			{
			    secmax=a[i];
			}
		}
		
		System.out.printf("\n The Second Maximum Element is:%d",secmax);
	}
}