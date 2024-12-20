import java.util.*;
public class ReverseOfNumber
{
  public static void main(String x[])
  {
     int num,reverse=0,rem=0;
     Scanner xyz=new Scanner(System.in);
    
     System.out.printf("Enter the Number");
     num=xyz.nextInt();

     while(num!=0)
     {
       rem=num%10;
       reverse=reverse*10+rem;
       num=num/10;
     }

     System.out.println("The Reverse Of Number Is:"+reverse);
   }
}