import java.util.*;
public class CheckPerfectNumber
{
  public static void main(String x[])
   {
     int num,sum=0,i;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the Number");
     num=xyz.nextInt();

     for(i=1;i<num;i++)
     {
       if(num%i==0)
         {
           sum=sum+i;
         }
     }
    
     if(sum==num)
       {
          System.out.printf("%d is Perfect Number",num);
       }
  
     else
       {
          System.out.printf("%d is NOT Perfect Number",num);
       }
    }
}