import java.util.*;
public class ReverseElementArray
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,temp;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Element of Array:");

     for(i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }

     for(i=0;i<=a.length/2;i++)
       {

        temp=a[i];
        a[i]=a[4-i];
        a[4-i]=temp;
       }

     System.out.println("Reverse Element of Array:");
     for(i=0;i<a.length;i++)
      {
       System.out.println(+a[i]);
      }
    
   }
}