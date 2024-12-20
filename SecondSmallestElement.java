import java.util.*;
public class SecondSmallestElement
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i;

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


      int small=a[0],ssmall=a[1];
     for(i=0;i<a.length;i++)
     {
       if(a[i]<small)
         {
           ssmall=small;
           small=a[i];
         }
       if(a[i]<ssmall && a[i]!=small)
         {
           ssmall=a[i];
         }
      }
      
     System.out.println("The  Second Smallest Elements of Array Is:"+ssmall);
    }
     
}
