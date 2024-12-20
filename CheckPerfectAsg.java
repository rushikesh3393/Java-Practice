/* Write a java program to check whether a number is Perfect number or not */

import java.util.*;
public class CheckPerfectAsg
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
	 System.out.printf("Enter the Number");
	 int num=xyz.nextInt();
	 
	 int sum=0;
	 for(int i=1;i<num;i++)
	 {
	   if(num%i==0)
	   {
	     sum=sum+i;
	   }
	 }

     if(sum==num)
        {
          System.out.printf("%d is Perfect Number",num);
        }
     else
        {
          System.out.printf("%d is not-Perfect Number",num);
        }
    }
}	
	   