import java.util.*;

public class SixthArray
 {
    public static void main(String x[]) 
       {
        int a[] = new int[6];
        int i, j, count = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of Array:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            count = 1;
            if (a[i] != -1) {
                for (j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -1;
                    }
                }

                System.out.printf("\nThe Occurrence of %d is %d", a[i], count);
            }
        }
    }
}
