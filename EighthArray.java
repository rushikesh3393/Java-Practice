import java.util.*;
public class EighthArray
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j,odd,even;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Element of Array:");

     for(i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }
 
     System.out.println("The even Elements Are:");
     for(i=0;i<a.length;i++)
      {
         if(a[i]%2==0)
            {
              System.out.println(+a[i]);
            }
      }
     System.out.println("The Odd Elements Are:");
      for(i=0;i<a.length;i++)
      {
         if(a[i]%2!=0)
            {
              System.out.println(+a[i]);
            }
      }
    
   }
}