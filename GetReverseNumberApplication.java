import java.util.*;

class Reverse
{
  int num;

  void setNum(int no)
  {
    num=no;
  }

  int getReverse()
  {
    int reverse=0;
    
    while(num!=0)
     {
       int rem=num%10;
       reverse=reverse*10+rem;
       num=num/10;
     }
    return reverse;
  }
}

public class GetReverseNumberApplication
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=xyz.nextInt();

    Reverse rv=new Reverse();
    rv.setNum(n);
    int reverse=rv.getReverse();

    System.out.printf("The Reverse number is :%d",reverse);
   }
}