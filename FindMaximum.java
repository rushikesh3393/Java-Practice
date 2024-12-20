import java.util.*;

public class FindMaximum
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);

    System.out.println("Enter the First number");
    int num1=xyz.nextInt();

    System.out.println("Enter the second number");
    int num2=xyz.nextInt();
 
    System.out.println("Enter the third number");
    int num3=xyz.nextInt();


   if(num1>num2 && num1>num3)
    {
      System.out.printf("The maximum number is :%d",num1);
    }

   if(num2>num1 && num2>num3)
    {
      System.out.printf("The maximum number is :%d",num2);
    }

   else
    {
      System.out.printf("The maximum number is :%d",num3);
    }

   }
}
   