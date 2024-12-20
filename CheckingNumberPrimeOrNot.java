import java.util.*;

class CheckPrime
{
  int num,i,count=0;

  void setNumber(int no)
  {
    num=no;
  }

  boolean checkPrime()
  {
    boolean p;
    for(i=1;i<=num;i++)
      {
         if(num%i==0)
          {
            count++;
          }
      }
   if(count==2)
      {
        return p=true;
      }
   else
      {
        return p=false;
      }
   }

}

public class CheckingNumberPrimeOrNot
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=xyz.nextInt();
     
    CheckPrime cp=new CheckPrime();
    cp.setNumber(n);
    boolean p=cp.checkPrime();
    if(p==true)
      {
        System.out.println("The Given Number is Prime Number");
      }
    else
      {
        System.out.println("The Given Number is NOT Prime Number");
      }
   }
}