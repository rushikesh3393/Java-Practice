import java.util.*;

public class RotateArray {
    public static void main(String x[]) 
      {
        int a[] = new int[10];
        int rotate[] = new int[10];
        int i, Index;

        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter the Elements in array");
        for (i = 0; i < a.length; i++) 
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("Elements of array Are");
        for (i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]);
        }

        System.out.println("Enter the index from that you want to Rotate");
        Index = xyz.nextInt();

        for (i = 0; i < a.length; i++) 
        {
            rotate[i] = a[(i + Index) % a.length];
        }

        System.out.println("After rotating the array is:");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t", rotate[i]);
        }
    }
}
