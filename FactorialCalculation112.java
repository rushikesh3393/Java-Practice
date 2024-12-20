/* Q2. Write program to create class name as Factorial with two functions 
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate factorial of number and return it
 */
 
 import java.util.*;
 class Factorial
 {
   int a,fact=1;
   void setValue(int x)
   {
	   a=x;
   }
   
   int getFactorial()
   {
	  
	   for(int i=1;i<=a;i++)
	   {
		 fact=fact*i;
       }
      
      return fact;
   }
 }

public class FactorialCalculation112
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	
	System.out.printf("Enter the Number");
	int num=xyz.nextInt();

    Factorial ft=new Factorial();

    ft.setValue(num);
    int result=ft.getFactorial();

    System.out.printf("The factorial of %d is:%d",num,result);
  }
}  
	
	