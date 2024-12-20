import java.util.*;
public class CeilingFloorInSortedArray 
{
    public static void main(String x[])
   {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        int i, j, n, ceiling = -1, floor = -1;

        System.out.println("\nEnter the elements in array:");
        for (i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nThe elements in array are:");
        for (i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }

        for (n = 0; n < 10; n++)
          {

            if (a[0] > n) {
                ceiling = a[0];
                floor = -1;
               }

            if (a[a.length-1] < n) {
                ceiling = -1;
                floor = a[a.length-1];
                break;
            }
         for (i = 0; i < 6; i++) 
          {
            if (a[i] == n) 
                   {
                    ceiling = n;
                    floor = n;
                   }

            if (a[i] < n && a[i + 1] > n)
                   {
                    ceiling = a[i + 1];
                    floor = a[i];
                   }
            }
            System.out.printf("Number=%d \t Ceiling=%d \t Floor=%d \n ",n,ceiling,floor);
  
        }
    }
}
