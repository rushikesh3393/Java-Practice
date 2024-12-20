import java.util.Scanner;

public class CircularSubArray 
{
    public static void main(String x[]) 
     {
        int a[] = new int[8];
        int i, j, k, sum = 0, maxsum = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }

        System.out.println("The Given Array is:");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t", a[i]);
        }

        for (i = 0; i < a.length; i++) 
          {
            sum = a[i];
            for (j = i + 1; j < i + a.length; j++) 
              {
                sum = sum+ a[j % a.length]; 
                if (sum > maxsum) 
                {
                    maxsum = sum;
                }
                
            }
        }
        System.out.println("\nThe maximum circular sum in the above array is: " + maxsum);
    }
}
