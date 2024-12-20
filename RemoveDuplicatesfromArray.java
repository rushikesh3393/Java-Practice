import java.util.*;
public class RemoveDuplicatesFromArray 
{
    public static void main(String x[])
 {
        int a[] = new int[10];
        int i, j, k, size = 10; 
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements Of Array:");
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
            for (j = i + 1; j < size;)
           { 
                if (a[i] == a[j])
                {
                    for (k = j; k < size - 1; k++)
                    {
                        a[k] = a[k + 1];
                    }
                    size--; 
                } 
                else 
                {
                    j++;
                }
            }
        }

        System.out.println("\nThe array after removing duplicates is:");
        for (i = 0; i < size; i++)
        { 
            System.out.printf("%d \t", a[i]);
        }
    }
}
