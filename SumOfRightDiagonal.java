import java.util.*;
public class SumOfRightDiagonal
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][3];

         int i,j,sum=0;
	 Scanner xyz = new Scanner(System.in);

	 System.out.println("Enter values in matrix");
	 for( i=0; i<a.length;i++)
	 {
	   for( j=0;j<a[i].length; j++)
	   {
		a[i][j]=xyz.nextInt();
	   }
	 }   
	 System.out.println("Display array values in  Matrix Are");
	 for( i=0; i<a.length; i++)
	 {
	   for( j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",a[i][j]);
	   }
	    System.out.printf("\n");
	 }
          
         for(i=0;i<a.length;i++)
         {
           for(j=0;j<a.length;j++)
            {
               if(i+j==2)
                {
                  sum=sum+a[i][j];
                }
            }
         }
         System.out.println("\nThe sum of Right Diagonal is:"+sum);
     }
}

        