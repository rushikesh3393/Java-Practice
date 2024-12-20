import java.util.*;
public class SumOfAllOddNumber
{
  public static void main(String x[])
   {
      int i=1,sum=0;
      Scanner xyz=new Scanner(System.in);

      System.out.println("Enter the Value of n");
      int n=xyz.nextInt();

      while(i<=n)
      {
        if(i%2!=0)
         {
          sum=sum+i;
         }
         i++;
      }
     System.out.printf("The Sum of All Odd Natural Number From 1 to %d is:%d",n,sum);
   }
}