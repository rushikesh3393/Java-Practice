import java.util.*;

class Power
{
  int bs,in;

  void setValue(int base,int index)
   {
       bs=base;
       in=index;
   }

  int getPower()
   {
      int power=1;
      for(int i=0;i<in;i++)
        {
          power=power*bs;
        }
    return power;
   }
  
   
}

public class GetPowerApplication
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);

     Power pw= new Power();

     System.out.println("Enter the value of Base");
     int b=xyz.nextInt();
     System.out.println("Enter the value of Index");
     int i=xyz.nextInt();

     pw.setValue(b,i);
     int power=pw.getPower();

     System.out.printf("The power is:%d",power);
   }
}

