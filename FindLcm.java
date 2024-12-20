import java.util.*;
public class FindLcm
{
 public static void main(String x[])
 {
   int num1,num2,i,hcf=1,lcm=1;

   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the First Number");
   num1=xyz.nextInt();

   System.out.println("Enter the Second Number");
   num2=xyz.nextInt();

   for(i=1;i<=num1;i++)
   {
     if(num1%i==0 && num2%i==0)
       {
          hcf=i;
       }
   }
   
    int p=num1 / hcf;
    int q=num2 / hcf;

    lcm=p*q*hcf;

   System.out.println("The LCM of This Two number is:"+lcm);
  }
}