import java.util.*;
public class SparseMatrix
{
  public static void main(String x[]) 
  {
    Scanner xyz=new Scanner(System.in);
    
    System.out.println("Enter row size");
    int rowsize=xyz.nextInt();
    System.out.println("Enter Column size");
    int columnsize=xyz.nextInt();

    int matrix[][]=new int[rowsize][columnsize];
    int i,j,nonzero=0,zero=0;

    System.out.printf("\nEnter the elements of the matrix:");
    for( i = 0; i < matrix.length; i++) 
      {
        for( j = 0; j < matrix.length; j++)
	  {
            matrix[i][j]=xyz.nextInt();
          }
      }

    System.out.printf("\nThe elements of the matrix:\n");
    for( i = 0; i < matrix.length; i++) 
      {
        for( j = 0; j < matrix.length; j++)
	  {
            System.out.printf("%d \t",matrix[i][j]);
          }
        System.out.println("\n");
      }
 
    for(i=0;i<matrix.length;i++)
     {
      for(j=0;j<matrix.length;j++)
       {
         if(matrix[i][j]==0)
           {
            zero++;
           }
         else
           {
            nonzero++;
           }
        }
      }
     
      if(zero>nonzero)
       {
          System.out.println("It is Sparse Matrix");
       }
      else
       {
          System.out.println("It is Not Sparse Matrix");
       }  
   }
}  