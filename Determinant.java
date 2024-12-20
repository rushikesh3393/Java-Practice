import java.util.*;
public class Determinant
{
  public static void main(String x[]) 
  {
    Scanner xyz=new Scanner(System.in);
    
    System.out.println("Enter row size");
    int rowsize=xyz.nextInt();
    System.out.println("Enter Column size");
    int columnsize=xyz.nextInt();

    int matrix[][]=new int[rowsize][columnsize];
    int i,j;

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

    
    int determinant = 0;
    for( i = 0; i < 3; i++)
      {
        determinant =determinant + (matrix[0][i] * (matrix[1][(i+1)%3] * matrix[2][(i+2)%3] - matrix[1][(i+2)%3] * matrix[2][(i+1)%3]));
      }                                
   
      System.out.printf("\nDeterminant of the matrix is: %d\n", determinant);
    }

}

