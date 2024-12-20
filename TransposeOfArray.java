import java.util.*;
public class TransposeOfArray
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][3];

         int i,j,temp=0;
	 Scanner xyz = new Scanner(System.in);

	 System.out.println("Enter values in first matrix");
	 for( i=0; i<a.length;i++)
	 {
	   for( j=0;j<a[i].length; j++)
	   {
		a[i][j]=xyz.nextInt();
	   }
	 }   
	 System.out.println("Display array valuesin First Matrix Are");
	 for( i=0; i<a.length; i++)
	 {
	   for( j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",a[i][j]);
	   }
	    System.out.printf("\n");
	}

         System.out.printf("\nTranspose of matrix is:\n");
          for (i = 0; i < a.length; i++)
	    {
            for (j = i; j < a.length; j++)
	       {
                  temp = a[i][j];
                  a[i][j] = a[j][i];
                  a[j][i] = temp;
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

 