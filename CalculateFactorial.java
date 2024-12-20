import java.util.*;
public class CalculateFactorial
{
 public static void main(String x[])
 {
   int num,i,fact=1;

   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the Number");
   num=xyz.nextInt();

   for(i=1;i<=num;i++)
   {
     fact=fact*i;
   }

   System.out.println("The Factorial of Number is:"+fact);
  }
}
  