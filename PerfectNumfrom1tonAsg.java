/* 4.	Write a java program to print all Perfect numbers between 1 to n.  */

/* Write a java program to check whether a number is Perfect number or not */

import java.util.*;
public class PerfectNumfrom1tonAsg
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
	 System.out.printf("Enter the Number");
	 int num=xyz.nextInt();
	 
	 System.out.printf("The Perfect number from 1 to n are:",num);
	for(int n=1;n<num;n++)
	{
	 int sum=0;
	 for(int i=1;i<n;i++)
	 {
	   if(n%i==0)
	   {
	     sum=sum+i;
	   }
	 }

     if(sum==n)
        {
          System.out.printf("%d \n",n);
        }
	}
   }
}	
	   