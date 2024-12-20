/* Q2. Write program to create class name as Factorial with two functions
void setValue(int x): this function accept number as parameter
int getFactorial(): this function can calculate factorial of number and return it. */

import java.util.*;
class Factorial
{
  int num,fact=1;

  void setValue(int n)
   {
     num=n;
   }

  int getFactorial()
   {
     for(int i=1;i<=num;i++)
       {
          fact=fact*i;
       }
     return fact;
   }
}

public class FindFactPas2
{
  public static void main(String x[])
  {
  Scanner xyz=new Scanner(System.in);
  Factorial ft=new Factorial();
  
  System.out.printf("Enter the Number ");
  
  int a=xyz.nextInt();

  ft.setValue(a);
  int result=ft.getFactorial();

  System.out.printf("The Factorial of the %d is:%d",a,result);
  }
}

 