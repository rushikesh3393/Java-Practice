import java.util.*;

public class CalculateSquareRooApp
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);

    System.out.println("Enter the number");
    int num=xyz.nextInt();

    float sqroot=(float)Math.sqrt(num);

    System.out.printf("The Square root of number is:%.2f",sqroot);
   }
}