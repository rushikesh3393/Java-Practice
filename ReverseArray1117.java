/* Write program to create class name as Reverse with two functions 
void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform reverse on array and return sorted array
 */
 
 import java.util.*;
 class Reverse
 {
	 int a[];
	 
	 void setArray(int a[])
	 {
		 this.a=a;
	 }
	 
	 int [] getSortArray()
	 {
		 int start=0;
		 int end=a.length-1;
		 
		 for(int i=0;i<a.length/2;i++)
		 {
			 int temp= a[start];
		        a[start]= a[end];
			      a[end]= temp;
				  
				  start++;
				  end--;
		 }
		 return a;
	 }
 }
 
 public class ReverseArray1117
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.printf("Eneter the Array Elements");
		 
		 int a[]=new int[5];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 
		 Reverse rs=new Reverse();
	     rs.setArray(a);
		 
		 int b[]=rs.getSortArray();
		 
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.printf("%d \t",b[i]);
		 }
	 }
 }
	 
	 