/* 10)  Write a program in java to find the smallest missing element from a sorted array?
Expected Output :
The given array is : 0 1 3 4 5 6 7 9 The missing smallest element is: 2
 */
 
 import java.util.*;
 public class SmallestMissingElementAsg
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
		 int k=0;
		 
		 System.out.println("The smallest missing Elements is:"); 
          for(int i=0;i<a.length;i++)
           {
             k=a[i]+1;
             if(k>a[i]&& k<a[i+1])
               {
                 System.out.println(+k);
                 break;
               }
           }
	 }
 }
		 