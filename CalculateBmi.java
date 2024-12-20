import java.util.*;

public class CalculateBmi
{
   public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);

     System.out.println("Enter the weight:");
     float weight=xyz.nextFloat();

     System.out.println("Enter the Height:");
     float height=xyz.nextFloat();

     float bmi=(float)(weight)/(height*height);

     if(bmi<18.5)
        {
          System.out.println("Underweight");
        }
     if(bmi>=18.5  && bmi<=24.9)
        {
          System.out.println("Normal weight");
        }
    if(bmi>=25 && bmi<29.9)
        {
          System.out.println("Over weight");
        }
    if(bmi>30)
        {
          System.out.println("Obesity");
        }
    }
}
