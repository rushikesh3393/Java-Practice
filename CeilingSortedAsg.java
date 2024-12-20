/* 8)	Write a program in java to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
Expected Output :
The given array is : 1 3 4 7 8 9 9 10
The ceiling of 5 is: 7
 */
 
 import java.util.*;
 public class CeilingSortedAsg
 {
   public static void main(String x[])
   {
	   Scanner xyz=new Scanner(System.in);
	   
	   System.out.printf("Enter the Size");
	   int size=xyz.nextInt();
	   
	   int a[]=new int[size];
	   int r[]=new int[size];
	   
	   System.out.printf("Enter the Array Elements:");
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=xyz.nextInt();
	   }
	   
	   System.out.printf("Enter the Value");
	   int value=xyz.nextInt();
	   
	   int ceiling=-1;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>value)
		   {
			   ceiling=a[i];
			   break;
		   }
	   }
	   
	   System.out.printf("The Ceiling of %d is %d",value,ceiling);
   }
 }