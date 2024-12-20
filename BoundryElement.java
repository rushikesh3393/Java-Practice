import java.util.*;
public class BoundryElement
{
  public static void main(String x[])
   {
     int a[][]=new int[3][3];
     int sum=0,i,j;
      
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the elements of Array:");
     for(i=0;i<a.length;i++)
       {
         for(j=0;j<a.length;j++)
          {
            a[i][j]=xyz.nextInt();
          }
       }
     

     for(i=0;i<a.length;i++)
       {
         for(j=0;j<a.length;j++)
          {
            if (i == 0 || i == a.length - 1 || j == 0 || j == a[i].length - 1)
                {
                    System.out.println(a[i][j] + " ");
                } 
            else {
                    System.out.println("  ");
                 }
          }
          System.out.println();
       }
    }
}
               