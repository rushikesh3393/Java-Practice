import java.util.*;
public class SimpleInterestApp
{
   public static void main(String x[])
    {
      Scanner xyz=new Scanner(System.in) ;
      System.out.println("Enter the Principle Amount");
      int p=xyz.nextInt();

      System.out.println("Enter the rate");
      int r=xyz.nextInt();

      System.out.println("Enter the time");
      float t=xyz.nextFloat();


      float SI=(p*r*t)/100;

      System.out.println("The Simple Interest is:"+SI);
   }
}