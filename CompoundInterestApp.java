import java.util.*;
import static java.lang.Math.*;
public class CompoundInterestApp
{
   public static void main(String x[])
    {
      Scanner xyz=new Scanner(System.in) ;
      System.out.println("Enter the Principle Amount");
      int p=xyz.nextInt();

      System.out.println("Enter the rate");
      float r=xyz.nextFloat();

      System.out.println("Enter the time");
      float t=xyz.nextFloat();


       float z= (float)r/100;
       float k=(1+z);

     float CI=(float)(p*(pow(k,t)));

      System.out.println("The Compound Interest is:"+CI);
   }
}