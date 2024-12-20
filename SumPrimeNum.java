/* 9.	Write a java program to find sum of all prime numbers between 1 to n. */


import java.util.*;

public class SumPrimeNum
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	
	System.out.printf("Enter the Number:");
	int num=xyz.nextInt();
	
	int sum=0;
	for(int n=1;n<=num;n++)
	{
	  int count=0;
	  for(int i=1;i<=num;i++)
	  {
	   if(n%i==0)
	    {
		  count++;
		}
	  }
	
	  if(count==2)
	  { 
	    sum=sum+n;
	  }
	  count=0;
	}
	
	System.out.printf("The Sum of Prime numbers from 1 to %d is:%d",num,sum);
  }
}
