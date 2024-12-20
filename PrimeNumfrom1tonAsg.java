/* 8.	Write a java program to print all Prime numbers between 1 to n. */


import java.util.*;

public class PrimeNumfrom1tonAsg
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	
	System.out.printf("Enter the Number:");
	int num=xyz.nextInt();
	
	System.out.printf("Prime Number from 1 to %d Are",num);
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
	    System.out.printf("%d \n",n);
	  }
	  count=0;
	}
  }
}
