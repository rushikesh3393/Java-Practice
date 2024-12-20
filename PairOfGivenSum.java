import java.util.*;
public class PairOfGivenSum
{
  public static void main(String x[])
   {
     int a[]=new int[6];
     int i,j;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Elements of array");
     
     for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }

     System.out.println("Elements of array Are");
     
     for(i=0;i<a.length;i++)
     {
       System.out.println(+a[i]);
     }
     
     System.out.println("Enter the Sum");
     int gsum=xyz.nextInt();

     System.out.println("Pair of elements can make the given sum by the value of index");
     for(i=0;i<a.length;i++)
       {
         for(j=i+1;j<a.length;j++)
         {
           if(a[i]+a[j]==gsum)
            {
              System.out.printf("%d , %d \n",i ,j);
            }
         }
      }
   }
}