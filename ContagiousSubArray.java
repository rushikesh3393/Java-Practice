import java.util.*;

public class ContagiousSubArray {
    public static void main(String x[]) {
        int a[] = new int[10];
        int i, j, k, l, max;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Elements Of Array:");
        for (i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("The Given Array is:");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d \t", a[i]);
        }

        System.out.println("\nThe contagious subarray of length 4 and their maximum value are:");
        for (i = 0; i < a.length - 3; i++) {
            for (j = i + 1; j < a.length - 2; j++) {
                for (k = j + 1; k < a.length - 1; k++) {
                    for (l = k + 1; l < a.length; l++) {
                        System.out.printf("%d \t %d \t %d \t %d\t\n", a[i], a[j], a[k], a[l]);
                    }
                }
            }
        }
    }
}
