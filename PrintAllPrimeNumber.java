import java.util.*;
public class PrintAllPrimeNumber
{
  public static void main(String x[])
  {
   int i,n,j,count=0;
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the Value of n");
   n=xyz.nextInt();

   for(i=2;i<=n;i++)
   {
     count=0;
     for(j=2;j<i;j++)
     {
       if(i%j==0)
        {
          count++;
        }
     }

     if(count==0)
      {
        System.out.println(+i);
      }
    }
  }
}