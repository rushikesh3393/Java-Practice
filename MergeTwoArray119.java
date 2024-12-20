/* Write program to create class name as MergeTwoArray with parameterized constructor 
MergeTwoArray(int [],int []): this constructor accept two array as parameter
int [] getMergeArray():       this function merge two array in third array and return new merged array */

import java.util.*;
class MergeTwoArray
{
	int a[];
	int b[];
	int c[];
	
	MergeTwoArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
		this.c = new int[a.length + b.length];
	}
	
	int [] getMergeArray()
	{
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		
		return c;
	}
}

public class MergeTwoArray119
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		int a[]=new int[5];
		int b[]=new int[5];
		
		
		
		System.out.printf("Enter the Elements of First Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.printf("Enter the Elements of Second Array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		
		MergeTwoArray ma=new MergeTwoArray(a,b);
		
		int c[] =ma.getMergeArray();
		
		System.out.printf("\n The Merged Array:");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("%d \t",c[i]);
		}
	}
}
		
		
		
		