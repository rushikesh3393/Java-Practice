/* Write program to create class name as FindEvenNo with three functions 
void setArray(int a[]): this function can accept array as parameter
 void  minArray(): this function can perform display min no from  array 
void  maxArray(): this function can perform display max no from  array 
 */ 
 
 import java.util.*;
 class FindEvenNo
 {
	 int a[];
    void setArray(int a[])
	{
		this.a=a;
	}
	
	void minArray()
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.printf("The Minimum Number from Array is:%d",min);
	}
	
	void maxArray()
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.printf("\nThe maximum Number from Array is:%d",max);
	}
 }
 
 public class Findminmax1119
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 int a[]=new int[5];
		 
		 System.out.printf("Enter the Array Element");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 
		 FindEvenNo fe=new FindEvenNo();
		 
		 fe.setArray(a);
		 fe.minArray();
		 fe.maxArray();
	 }
 }