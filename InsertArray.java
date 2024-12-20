import java.util.*;
public class InsertArray
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j,value;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Element of Array:");

     for(i=0;i<a.length-1;i++)
       {
         a[i]=sc.nextInt();
       }
     
      System.out.println("Enter the value that you want to insert");
      value=sc.nextInt();
      a[a.length-1]=value;

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
         System.out.println("Element of Array after sorting and inserting are:");

        for(i=0;i<a.length;i++)
         {
          System.out.println(+a[i]);
         }
     
    }
}
  
 