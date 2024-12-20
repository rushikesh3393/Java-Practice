/* 6)	Write a program in java to find the majority element of an array ?
A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Expected Output :
The given array is : 4 8 4 6 7 4 4 8
There are no Majority Elements in the given array.
 */
 
 import java.util.*;
 public class MajorityElementAsg
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 System.out.printf("Enter the Size of Array:");
		 int size=xyz.nextInt();
		 
		 int a[]=new int[size];
		 System.out.printf("Enter the Array Elements:");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 
		 
		 boolean flag=false;
		
		 for(int i=0;i<a.length;i++)
		 {
			  int count=1;
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 count++;
				 }
			 }
		 	 
			 if(count> a.length/2)
			 {
				 System.out.printf("The Majority Element is:%d",a[i]);
				  flag=true;
			 }
			  count=1;
		 }
		 
		 
		 if(flag==false)
		 {
			 System.out.printf("There is No Majority Elements");
		 }
	 }
 }