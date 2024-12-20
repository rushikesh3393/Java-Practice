import java.util.*;
public class SumOfFirstLastNumber
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
    int sum=first+last;
    System.out.printf("The Sum of first and Last number is %d",sum);
  }
}
 
     
      