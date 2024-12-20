import java.util.*;
public class SumOfDigitsOfNumber
{
  public static void main(String x[])
  {
     int num,sum=0,rem=0;
     Scanner xyz=new Scanner(System.in);
    
     System.out.printf("Enter the Number");
     num=xyz.nextInt();

     while(num!=0)
     {
       rem=num%10;
       sum=sum+rem;
       num=num/10;
     }

     System.out.println("The Sum of Digits Of Number Is:"+sum);
   }
}