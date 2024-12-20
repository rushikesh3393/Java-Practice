import java.util.*;
public class UpperTriangle
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][3];

         int i,j;
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
 
        System.out.println("\n The Upper Triangle :");
        for(i=0;i<a.length;i++)
        {
          for(j=0;j<a.length;j++)
           {
            if(i<j)
             {
               a[i][j]=0;
             }
           }
         }

	 for( i=0; i<a.length; i++)
	 {
	   for( j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",a[i][j]);
	   }
	    System.out.printf("\n");
	 }
    }
}
        