import java.util.*;
public class MultiplicationTable
{
  public static void main(String x[])
   {
      int i=1;
      Scanner xyz=new Scanner(System.in);

      System.out.println("Enter the Value of n");
      int n=xyz.nextInt();

      System.out.printf("\nThe Multiplication Table of %d\n",n);
      while(i<=10)
      {
         System.out.printf("%d \n",n*i);
         i++;
      }
     
   }
}