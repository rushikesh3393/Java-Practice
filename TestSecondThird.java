/* Write a program in C to rotate an array by N positions.
Expected Output:
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
 */ 
 
import java.util.*;
 public class TestSecondThird
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
	   
	   System.out.printf("Enter the Index that you want to Rotate");
	   int pos=xyz.nextInt();
	   
	   for(int i=0;i<a.length;i++)
	   {
		   r[i]= a[(pos+i)%a.length];                          /*r[1]=a[(4+1)%10];   r[1]=a[5];*/
	   }
	   
	   System.out.printf("The Array After Rotation Is:");
	   for(int i=0;i<r.length;i++)
	   {
		   System.out.printf("%d \t",r[i]);
		   
	   }
   }
 }