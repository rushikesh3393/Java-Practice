import java.util.*;

public class CalculteCompoundInterest
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
  
    System.out.println("Enter the Principle");
    float principle=xyz.nextFloat();

    System.out.println("Enter the rate");
    float rate=xyz.nextFloat();

    System.out.println("Enter the number of times interest compounded per year");
    float n=xyz.nextFloat();

    System.out.println("Enter the Time(years)");
    float time=xyz.nextFloat();


   float z=(float) rate/n;

   float k=(float) n*time;

   float compoundinterest=(principle) + (float)Math.pow((1+z),(k));

   System.out.printf("The compound interest is:%.4f",compoundinterest);
  }
}
