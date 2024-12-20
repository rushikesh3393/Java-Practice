import java.util.*;
public class ProductOfDigitsOfNumber
{
  public static void main(String x[])
  {
     int num,product=1,rem=0;
     Scanner xyz=new Scanner(System.in);
    
     System.out.printf("Enter the Number");
     num=xyz.nextInt();

     while(num!=0)
     {
       rem=num%10;
       product=product*rem;
       num=num/10;
     }

     System.out.println("The product of Digits Of Number Is:"+product);
   }
}