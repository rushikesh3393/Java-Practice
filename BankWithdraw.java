import java.util.*;
public class BankWithdraw
{
  public static void main(String k[])
  {
    Scanner xyz=new Scanner(System.in);


    System.out.println("Enter how much money pooja want to Withdraw");
    int x=xyz.nextInt();

    System.out.println("Pooja's Initial Bank Balance");
    int y=xyz.nextInt();

    if(x%5==0)
      {
        float balance=y-x-(0.50f);
        System.out.println(+balance);
      }
  
    if(x%5!=0)
      {
        System.out.println(+y);
      }
   }
}
