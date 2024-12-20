/* 5.	Write a java program to check whether a number is Strong number or not. */

import java.util.*;
public class CheckStrongAsg
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
	 System.out.printf("Enter the Number");
	 int num=xyz.nextInt();
	 
	 int sum=0;
	 int temp=num;
	 
	 
	
	 while(temp>0)
	 {int fact=1;
	    int digit=temp%10;
		for(int j=1;j<=digit;j++)
		  {
              fact=fact*j;
		  }
		  sum=sum+fact;
		  temp=temp/10;
	 }	
	 
	 if(num==sum)
	 {
	    System.out.printf("%d is Strong Number",num);
	 }
	 else
	 {
	    System.out.printf("%d is not-Strong Number",num);
	 }
  }
}