import java.util.*;
public class GivenSumSubarray
 {
    public static void main(String x[]) 
    {
        int a[] = new int[8];
        int i, j,k=0, sum = 0;

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

       /* System.out.printf("\nEnter the Target: ");
        int target = xyz.nextInt();

        boolean found = false;
        for (i = 0; i < a.length; i++)
           {
            sum = a[i];
            for (j = i + 1; j < a.length; j++) {
                sum =sum+ a[j];
                if (sum == target)
                   {
                     k=j;
                     System.out.printf("[%d..%d]", i, k);
                     found = true;
                }
            }
        }*/
        if (!found) 
        {
            System.out.println("No subarray found with the given sum.");
        }
    }
}
