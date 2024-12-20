import java.util.*;
public class FibonacciSeries
 {
  public static void main(String x[])
   {
     int n,num1=0,num2=1,sum=0,i,temp;

     Scanner xyz=new Scanner(System.in);
     
     System.out.println("Enter the Value of n");
     n=xyz.nextInt();

     System.out.println("The Fibonacci Series Are:");

     for(i=1;i<=n;i++)
      {
        sum=num1+num2;
        System.out.printf("%d\t",num1);

        temp=num1;
        num1=num2;
        num2=sum;
      }
   }
 }