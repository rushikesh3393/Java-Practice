import java.util.*;
public class InsertUnsortedArray
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j,value,index;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Element of Array:");

     for(i=0;i<a.length-1;i++)
       {
         a[i]=sc.nextInt();
       }
     
      System.out.println("Enter the value that you want to insert");
      value=sc.nextInt();

      System.out.println("Enter the index that you want to insert");
      index=sc.nextInt();

        for(i=a.length-1;i>=index;i--)
         {
          
           a[i]=a[i-1];
           
         }

       a[index]=value;
      System.out.println("Element of Array after inserting are:");
      for(i=0;i<a.length;i++)
          {
            System.out.println(+a[i]);
          }
    }
}
  
 