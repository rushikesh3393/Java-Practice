import java.util.*;
public class CandySold
{
 public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    int n=10;
    System.out.println("Enter the Number of Candies Served to CustoMer");
    int m=xyz.nextInt();


    if(m<5)
      {
        int k=n-m;
        System.out.println("\n The number of candies sold:"+m);
        System.out.println("\n The number of candies Remaining:"+k);
      }


    if(m>=5)
      {
        int k=n-m;
        System.out.println("\n The number of Csndies Sold:"+m);
        System.out.println("\n The Jar is refilled");
        k=10;
        System.out.println("\n The number of candies Remaining:"+k);
      }
    if(m==0 && m>10)
      {
        System.out.println("Invalid Input");
        k=10;
        System.out.println("\n The number of candies Remaining:"+k);
   }
}