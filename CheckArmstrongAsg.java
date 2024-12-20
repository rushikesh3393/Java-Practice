/*1.	Write a java program to check whether a number is Armstrong number or not.*/

import java.util.*;
public class CheckArmstrongAsg
{
  public static void main(String x[])
    {
	   Scanner xyz=new Scanner(System.in);
	   System.out.printf("Enter the Number");
	   int num=xyz.nextInt();
	   
	   int num1=num;
	   int count=0;
	   int i=0;
	   
	   while(num1>0)
	   {
	      num1=num1/10;
		  count++;
	   }
	   
	   num1=num;
	   int sum=0;
	   for(i=0;i<count;i++)
	   {
	     sum=sum+ (int)Math.pow(num1%10,count);
		 num1=num1/10;
	   }
	   
	   if(sum==num)
	   {
	     System.out.printf("%d is Armstrong Number",num);
	   }
	   else
	   {
	     System.out.printf("%d is Not-Armstrong Number",num);
	   }
	}
}