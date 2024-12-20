import java.util.*;
public class CheckStrongNumber
{
  public static void main(String x[])
   {
     int num,fact=1,i,sum=0,temp,rem=0;

     Scanner xyz=new Scanner(System.in);

     System.out.println("Enter the Number:");
     num=xyz.nextInt();

     temp=num;

     while(num!=0)
     {
       rem=num%10;
       fact=1;
          for(i=1;i<=rem;i++)
             {
               fact=fact*i;
             }
           sum=sum+fact;
           num=num/10;
     }
  
     if(sum==temp)
      {
        System.out.printf("%d is Strong Number",temp);
      }
     else
      {
        System.out.printf("%d is NOT Strong Number",temp);
      }
    }
}