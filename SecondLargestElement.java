import java.util.*;
public class SecondLargestElement
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

     int max=a[0];
     int smax=a[1];
     for(i=0;i<a.length;i++)
      {
        if(a[i]>max)
         {
          smax=max;
           max=a[i];
           
         }

         if(a[i]<max && a[i]>smax)
         { 
           smax=a[i];
         }
      }
      System.out.println("The Second Largest Element is:"+smax);
    }
}
