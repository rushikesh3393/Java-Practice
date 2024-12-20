/* 3)	Write a program in java to delete an element at desired position from an array.
Test Data :
Input the size of array : 5
Input 5 elements in the array in ascending order:
element - 0 : 1
element - 1 : 2
element - 2 : 3
element - 3 : 4
element - 4 : 5
Input the position where to delete: 3
Expected Output :
The new list is : 1 2 4 5
 */

import java.util.*;
public class DeleteFromPosition
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Number of elements Stored in Array:\n");
		int size1=xyz.nextInt();
		
		int a[]=new int[size1];
		
		System.out.printf(" Enter the Elements of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.printf("Enter The Position:\n");
		int position=xyz.nextInt();
		
		for(int i=position-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}

		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.printf("%d \t",a[i]);
		}
	}
}