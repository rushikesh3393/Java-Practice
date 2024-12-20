import java.util.*;

class Factorial
{
  int num;

  void setNumber(int no)
  {
    num=no;
  }

  int getFactorial()
  {
    int fact=1;

    for(int i=1;i<=num;i++)
     {
       fact=fact*i;
     }
    return fact;
   }
}

public class FindFactorialApplication
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     Factorial ft= new Factorial();

     System.out.println("Enter the Number");
     int n=xyz.nextInt();

     ft.setNumber(n);
     int fact=ft.getFactorial();
      System.out.printf("The Factorial of %d is %d",n,fact);
   }
}


