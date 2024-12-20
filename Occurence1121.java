/* Write program to create class name as occurrence with two functions 
void setArray(int a[]): this function can accept array as parameter
void getoccurrence (): this function show occurrence of every element form array
 */
 
 import java.util.*;
class Occurrence
 {
	 int a[];
	 void setArray(int a[])
	 {
		 this.a=a;
	 }
	 
	 void getoccurrence()
	 {
		 int count=1;
		 int size= a.length;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<size;j++)
			 {
				 if(a[i]==a[j])
				 {
					 count++;
					 for(int k=j;k<size;k++)
					 {
						 a[k]=a[k+1];
						 size--;
					 }
				 }
			 }
			 System.out.printf("\nThe Occurrence of %d is %d",a[i],count);
			 count=1;
		 }
	 }
 }
 
 public class Occurence1121
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 int a[]=new int[8];
		 
		 System.out.printf("Enter the Element in array");
		 
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 
		 Occurrence oc=new Occurrence();
		 oc.setArray(a);
		 oc.getoccurrence();
	 }
 }
		 
 