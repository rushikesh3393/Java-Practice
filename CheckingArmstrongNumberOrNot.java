import java.util.*;

class CheckArmstrong
{
  int num,sum=0,i,count=0;

   void setValue(int no)
  {
    num=no;
  }

  boolean checkArmstrong()
  {
    boolean p;
    int temp=num;
    while(temp!=0)
    {
      temp=temp/10;
      count++;
    }
    
    temp=num;
    for(i=0;i<count;i++)
    {
      sum=sum+(int)Math.pow(temp%10,count);
      temp=temp/10;
    }
   if(sum==num)
     {
       return p=true;
     }
   else
     {
       return p=false;
     }
  }

}

public class CheckingArmstrongNumberOrNot
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=xyz.nextInt();
     
    CheckArmstrong am=new CheckArmstrong();
    am.setValue(n);
    boolean p=am.checkArmstrong();
    if(p==true)
      {
        System.out.println("The Given Number is Armstrong Number");
      }
    else
      {
        System.out.println("The Given Number is NOT Armstrong Number");
      }
   }
}