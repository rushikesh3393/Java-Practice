import java.util.*;
public class IdentityMatrix 
{
    public static void main(String x[])
  {
        int a[][] = new int[3][3];
        int i, j;
        Scanner xyz = new Scanner(System.in);
        boolean flag = true; 

        System.out.println("Enter values in matrix");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = xyz.nextInt();
            }
        }

        System.out.println("The Matrix is");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
       }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
                    flag = false;
                    break; 
                }
            }
            if (!flag)
                break;
        }

        if (flag) {
            System.out.println("\nIt is an Identity Matrix");
        } else {
            System.out.println("\nIt is NOT an Identity Matrix");
        }
    }
}
