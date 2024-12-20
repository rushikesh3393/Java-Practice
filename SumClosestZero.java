import java.util.*;

public class SumClosestZero 
{
  public static void main(String x[])
 {
        int a[] = new int[8];
        int i, j;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (i = 0; i < a.length; i++) 
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("The Given Array is:");
        for (i = 0; i < a.length; i++)
        {
            System.out.printf("%d \t", a[i]);
        }

        int mindiff = 999;
        int num1 = 0, num2 = 0;

        for (i = 0; i < a.length; i++)
          {
            for (j = i + 1; j < a.length; j++)
             {
                int sum = a[i] + a[j];
                int diff = Math.abs(sum);
                if (diff < mindiff)
                {
                    mindiff = diff;
                    num1 = a[i];
                    num2 = a[j];
                }
            }
        }
        System.out.printf("\nThe sum Closest to zero is: %d and %d\n", num1, num2);
    }
}
