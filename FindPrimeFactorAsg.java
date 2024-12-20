/* 10.	Write a java program to find all prime factors of a number. */
import java.util.*;

public class FindPrimeFactorAsg
{
  public static void main(String x[])
    {
	  Scanner xyz=new Scanner(System.in);
	  
	  System.out.printf("Enter the Number :");
	  int num=xyz.nextInt();
	  
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
	     if(num%n==0)
		 {
		   System.out.printf("%d \t",n);
		 }
	   }
	   
	   count=0;
	}
    }
}	