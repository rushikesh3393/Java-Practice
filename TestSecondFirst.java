/* Q1. Write a program in JAVA to find the second smallest element in an array without using sorting? */

import java.util.*;
public class TestSecondFirst
{
  public static void main(String x[])
   {
	  Scanner xyz=new Scanner(System.in);
	  
	  System.out.printf("Enter the Size");
	  int size=xyz.nextInt();
	  
	  int a[]=new int[size];
	  
	  System.out.printf("Enter the Array Elements");
	  for(int i=0;i<a.length;i++)
	    {
		  a[i]=xyz.nextInt();
	    }
	  
	  int min=a[0];
	  int secmin=a[0];
	  
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]<min)
		  {
			  secmin=min;
			  min=a[i];
		  }
		  
		  if(a[i]<secmin && a[i]<min)
		  {
			  secmin=a[i];
		  }
	  }
	  
	  System.out.printf("The Second Maximum Element is:%d",secmin);
  }
}
