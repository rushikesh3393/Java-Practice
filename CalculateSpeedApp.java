import java.util.*;
public class CalculateSpeedApp
{

  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     
     System.out.println("Enter the distance");
     float distance=xyz.nextFloat();
     
     System.out.println("Enter the time");
     float time=xyz.nextFloat();

     float speed= distance/time;
  
     System.out.printf("The speed of vehicle is:%.4f",speed);
   }
}
     