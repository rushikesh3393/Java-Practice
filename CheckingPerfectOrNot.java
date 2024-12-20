import java.util.*;
class CheckPerfect
{
  int num,sum=0,i;
  void setValue(int no)
   {
     num=no;
   }
  boolean checkPerfect()
   {
      boolean p;
      for(i=1;i<num;i++)
       {
         if(num%i==0)
            {
              sum=sum+i;
            }
       }
       if(sum==num)
       {
         p=true;
         return p;
       }
       else
       {
          p=false;
          return p;
       }

   }
}

public class CheckingPerfectOrNot
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the Number");
     int n=xyz.nextInt();

     CheckPerfect cp=new CheckPerfect();

     cp.setValue(n);
       
     boolean p=cp.checkPerfect();
      if(p==true)
        {
          System.out.printf("%d is Perfect Number",n);
        }
       else
        {
          System.out.printf("%d is NOT Perfect Number",n);
        }
   }
}