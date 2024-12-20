import java.util.*;
public class NumberOfDigitsInNumber
{
  public static void main(String x[])
   {
      int count=0;
      Scanner xyz=new Scanner(System.in);

      System.out.println("Enter the Number");
      int n=xyz.nextInt();

      while(n!=0)
      {
         n=n/10;
         count++;
      }
     System.out.println("The Number of digits In Given Number is:"+count);
   }
}