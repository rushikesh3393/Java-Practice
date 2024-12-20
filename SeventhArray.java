import java.util.*;
public class SeventhArray
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j,min,max;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Element of Array:");

     for(i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }
 
     min=a[0];
     for(i=1;i<a.length;i++)
      {
         if(a[i]<min)
          {
            min=a[i];
           }
      }
     System.out.println("The minimum Eement is:"+min);

     max=a[0];
     for(i=1;i<a.length;i++)
      {
         if(a[i]>max)
          {
            max=a[i];
          }
      }
     System.out.println("The maximum Eement is:"+max);
   }
}