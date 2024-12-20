/* Write a program in java to find a pair with given sum in the array.
Expected Output :
The given array : 6 8 4 -5 7 9 The given sum : 15
Pair of elements can make the given sum by the value of index 0 and 5
 */
 
 import java.util.*;
 public class PairOfGivenSumAsg
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
		 
		 System.out.printf("Enter the Sum");
		 int sum=xyz.nextInt();
		 
		 System.out.printf("Pair of elements can make the given sum by the value of index Are:");
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]+a[j]==sum)
				 {
					 System.out.printf("(%d,%d)\t",i,j);
				 }
			 }
		 }
				 
	 }
 }