import java.util.*;
public class SortArray
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Element of Array:");

     for(i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }
     
     for(i=0;i<a.length;i++)
       {
         for(j=i+1;j<a.length;j++)
         {
           if(a[i]>a[j])
            {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            }
          }
        }
  
      System.out.println("Element of Array After Sorting:");

       for(i=0;i<a.length;i++)
       {
         System.out.println(+a[i]);
       }
     }
}  
     
 