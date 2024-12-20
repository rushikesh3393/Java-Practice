import java.util.*;
public class CheckArmstrong
{
  public static void main(String x[])
   {
     int num,i,count=0,sum=0,temp;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the Number");
     num=xyz.nextInt();

     temp=num;

     while(num!=0)
     {
       num=num/10;
       count++;
     }

     num=temp;
    for(i=0;i<count;i++)
     {
       sum=sum+(int)Math.pow(temp%10,count);
       temp=temp/10;
     }

    if(sum==num)
      {
        System.out.printf("%d is Armstrong Number",num);
      }
    else
      {
        System.out.printf("%d is NOT Armstrong Number",num);
      }
    }
}