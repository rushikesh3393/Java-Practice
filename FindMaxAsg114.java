/* Q4. Write program to create class name as FindMax with two functions 
 void setArray(int a[]): this function is used for accept array as parameter 
 int getMax(): this function can find the max value from array and return it.
 */
 
 import java.util.*;
 class FindMax
 {
   int a[];
   
   void setArray(int a[])
   {
	   this.a=a;
   }
   
   int getMax()
   {
	   int max=a[0];
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
	   }
	   return max;
   }
 }
 
 public class FindMaxAsg114
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 int a[]=new int[5];
		 
		 System.out.printf("Enter the Array Elements");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 
		 FindMax fm=new FindMax();
		 
		 fm.setArray(a);
		 
		 int result=fm.getMax();
		 
		 System.out.printf("The maximum Element is:%d",result);
	 }
 }