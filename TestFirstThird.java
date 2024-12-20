/*  Given an integer, we have to write a Fibonacci series program in C up to the nth term using loop and recursion.
 We have to print all the numbers of the series from starting up to the Nth term where N is the input given by the user.
Example:
Input1:  10
Output1: 0 1 1 2 3 5 8 13 21 34
 */

import java.util.*;
public class TestFirstThird
 {
  public static void main(String x[])
   {
     int n,num1=0,num2=1,sum=0,i,temp;

     Scanner xyz=new Scanner(System.in);
     
     System.out.println("Enter the Value of n");
     n=xyz.nextInt();

     System.out.println("The Fibonacci Series Are:");

     for(i=1;i<=n;i++)
      {                                                                      
        sum=num1+num2;                                                          /*sum=0+1=1          1+1=2      1+2=3   2+3=5*/
        System.out.printf("%d\t",num1);                                              /* num1=0;          1           1      2*/
 
        temp=num1;                                                               /*temp=num1(0)           1         1        2*/
        num1=num2;                                                               /* num1=num2  num1=1    1          2       3*/
        num2=sum;                                                                 /* num2=1               2          3       5*/
      }
   }
 }
		
  