import java.util.*;
public class CombinationNumberElement
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j,k,l;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the Elements of Array:");
     for(i=0;i<a.length;i++)
      {
        a[i]=xyz.nextInt();
      }
     System.out.println("The given Array is:");
      for(i=0;i<a.length;i++)
       {
         System.out.printf("%d \t",a[i]);
       }

      System.out.println("\n Number of Combinations are:");
      for(i=0;i<a.length;i++)
        {
       for(j=i+1;j<a.length;j++)
         {
        for(k=j+1;k<a.length;k++)
          {
          for(l=k+1;l<a.length;l++)
           {
             System.out.printf("\n %d%d%d%d",a[i],a[j],a[k],a[l]);
           }
          }
        }
      }
    }
}