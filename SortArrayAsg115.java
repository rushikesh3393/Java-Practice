/*  Q5. Write program to create class name as SortArr with two functions 
 void setArray(int a[]): this function can accept array as parameter 
 int [] getSortArray() :  this function can perform sorting on array and return sorted array 
 */
 
 import java.util.*;
 class SortArr
 {
	 int a[];
	 
	 void setArray(int a[])
	 {
		 this.a=a;
	 }
	 
	 int []getSortArray()
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		  
		 return a;
	 }
 }
 
 public class SortArrayAsg115
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
		 
		 SortArr sa=new SortArr();
		 
		 sa.setArray(a);
		 
		  int b[]=sa.getSortArray();
		 
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.printf("%d \t",b[i]);
		 }
	 }
 }