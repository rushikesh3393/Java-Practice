import java.util.*;
public class EvenNumber
{
  public static void main(String x[])
   {
      int i=1;
      Scanner xyz=new Scanner(System.in);

      System.out.println("Enter the Value of n");
      int n=xyz.nextInt();

      while(i<=n)
      {
        if(i%2==0)
        {
        System.out.printf("%d \t",i);
        }
        i++;
      }
   }
}