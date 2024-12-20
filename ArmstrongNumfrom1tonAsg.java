/* 2.	Write a java program to print all Armstrong numbers between 1 to n. */

import java.util.*;
public class TestSecOneThird
{
 public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	
	System.out.printf("Enter the Number");
	int num=xyz.nextInt();
	
	for(int n=1;n<=num;n++)
	{
	  int num1=n;
	
	  int sum=0,count=0;
	
	  int i=0;
	  while(num1>0)
	  {
	    num1=num1/10;
	    count++;
	  }
	  
	  num1=n;
	  for(i=0;i<count;i++)
	    {
			int digit = num1 % 10;
		  sum=sum+(int)Math.pow(digit,count);
		  num1=num1/10;
		}
	  if(sum==n)
	  {
	    System.out.printf("%d \n",n);
	  }
	}
  }
}
		