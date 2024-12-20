import java.util.*;
public class ElectricityBillApp
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     
     System.out.println("Enter the Unit");
     int a=xyz.nextInt();
 
     if(a<=50)
       {
         float total= 0.50f*a;
         float totalbill=0.20f*total;
         float finalbill=total+totalbill;
         System.out.println("The Electricity Bill is"+finalbill);
       }

     if(a>50  &&  a<=150)
       {
         float total= 0.75f*a;
         float totalbill=0.20f*total;
         float finalbill=total+totalbill;
         System.out.println("The Electricity Bill is"+finalbill);
       }

     if(a>150 && a<=250)
       {
         float total= 1.20f*a;
         float totalbill=0.20f*total;
         float finalbill=total+totalbill;
         System.out.println("The Electricity Bill is"+finalbill);
       }

    if(a>250)
      {
        float total= 1.50f*a;
        float totalbill=0.20f*total;
        float finalbill=total+totalbill;
        System.out.println("The Electricity Bill is"+finalbill);
      }
   }
}