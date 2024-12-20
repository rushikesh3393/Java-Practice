import java.util.*;
public class SumOfAllNaturalNumber
{
  public static void main(String x[])
   {
      int i=1,sum=0;
      Scanner xyz=new Scanner(System.in);

      System.out.println("Enter the Value of n");
      int n=xyz.nextInt();

      while(i<=n)
      {
        sum=sum+i;
        i++;
      }
     System.out.printf("The Sum of All Natural Number From 1 to %d is:%d",n,sum);
   }
}