import java.util.*;
public class naturalNumber
{
  public static void main(String x[])
   {
      int i=1;
      Scanner xyz=new Scanner(System.in);

      System.out.println("Enter the Value of n");
      int n=xyz.nextInt();

      while(i<=n)
      {
        System.out.println("\t"+i);
        i++;
      }
   }
}