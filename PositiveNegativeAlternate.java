import java.util.*;
public class PositiveNegativeAlternate {
    public static void main(String x[]) {
        int a[] = new int[9];
        int i, pcount = 0, ncount = 0;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Elements of Array:");
        for (i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
            if (a[i] > 0) {
                pcount++;
            } else {
                ncount++;
            }
        }

        int positive[] = new int[pcount];
        int negative[] = new int[ncount];

        int pIndex = 0, nIndex = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive[pIndex++] = a[i];
            } else {
                negative[nIndex++] = a[i];
            }
        }

        int rearranged[] = new int[a.length];
        pIndex = 0;
        nIndex = 0;
        int index = 0;
        while (pIndex < pcount && nIndex < ncount)
        {
            rearranged[index++] = negative[nIndex++];
            rearranged[index++] = positive[pIndex++];
        }
        
        while (pIndex < pcount) 
        {
            rearranged[index++] = positive[pIndex++];
        }
        while (nIndex < ncount) 
        {
            rearranged[index++] = negative[nIndex++];
        }

        System.out.println("\nThe Elements of Array After Arranging Are:");
        for (i = 0; i < rearranged.length; i++) {
            System.out.printf("%d \t", rearranged[i]);
        }
    }
}
