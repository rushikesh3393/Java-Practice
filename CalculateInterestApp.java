import java.util.*;

public class CalculateInterestApp
{
   public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the rate");
     float rate=xyz.nextFloat();

     System.out.println("Enter the principle");
     float principle=xyz.nextFloat();

     System.out.println("Enter the time");
     float time=xyz.nextFloat();
  
     float interest=(principle*time*rate)/100;

     System.out.printf("The Simple Interest is:%.4f",interest);
   }
}