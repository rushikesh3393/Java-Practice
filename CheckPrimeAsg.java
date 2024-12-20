/* 7.	Write a  java program to check whether a number is Prime number or not. */

import java.util.*;

public class CheckPrimeAsg
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	
	System.out.printf("Enter the Number:");
	int num=xyz.nextInt();
	
	int count=0;
	for(int i=1;i<=num;i++)
	{
	  if(num%i==0)
	    {
		  count++;
		}
	}
	
	if(count==2)
	{ 
	  System.out.printf("%d is prime number",num);
	}
	else
	{
	  System.out.printf("%d is Not prime number",num);
	}
  }
}
