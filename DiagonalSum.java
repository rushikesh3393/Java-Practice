import java.util.*;
public class DiagonalSum
{
  public static void main(String x[])
   {
     int a[][]=new int[2][2];
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
            if(i==j)
             {
               sum=sum+a[i][j];
             }
          }
        }
   
     System.out.println("The sum of Diagonal is:"+sum);
   }
}
 
     
     