import java.util.*;
public class TwoDArrayMultiplication
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][3];
         int b[][]=new int[3][3];
         int c[][]=new int[3][3];
         int i,j,k,sum=0;
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

         System.out.println("Enter values in Second matrix");
	 for( i=0; i<b.length;i++)
	 {
	   for( j=0;j<a[i].length; j++)
	   {
		b[i][j]=xyz.nextInt();
	   }
	 }   
	 System.out.println("Display array valuesin Second Matrix Are");
	 for( i=0; i<b.length; i++)
	 {
	   for( j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",b[i][j]);
	   }
	    System.out.printf("\n");
	}

        for (i = 0; i < a.length; i++) 
	{
          for (j = 0; j < b[0].length; j++)
	   {
              sum = 0;                                   
              for (k = 0; k < a[0].length; k++)               
	      {                                  
                sum =sum + a[i][k] * b[k][j];     
              }
              c[i][j] = sum;
           }
        }
        System.out.println("The multiplication of Two matrices are");
	 for( i=0; i<a.length; i++)
	 {
	   for( j=0;j<b[0].length;j++)
	   {
		 System.out.printf("%d\t",c[i][j]);
	   }
	    System.out.printf("\n");
	}

    }
}