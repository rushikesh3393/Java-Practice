import java.util.*;
public class FirstLastNumber
{
 public static void main(String x[])
  {
    int num,first,last;

    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Number");
    num=xyz.nextInt();

    last=num%10;

    while(num>10)
    {
      num=num/10;
    }
 
    first=num;
    System.out.printf("The first and Last number is %d and %d",first,last);
  }
}
 
     
      