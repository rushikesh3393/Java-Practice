import java.util.*;
public class SumOfRowColumn
{
    public static void main(String x[])
    {
	 int a[][]=new int[2][2];

         int i,j,row1=0,row2=0,col1=0,col2=0;
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
             if(i==0)
              {
                row1=row1+a[i][j];
              }
             if(i==1)
              {
                row2=row2+a[i][j];
              }
             if(j==0)
              {
                col1=col1+a[i][j];
              }
             if(j==1)
              {
                col2=col2+a[i][j];
              }
            }
          }
        System.out.printf("\nThe sum of row1=%d \n The sum of row2=%d \n The sum of column1=%d \n The sum of column2=%d \n",row1,row2,col1,col2);
     }
}
               