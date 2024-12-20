import java.util.*;

public class DeleteElement {
    public static void main(String x[]) {
        int dt, i;
        int a[] = new int[6];

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Elements of Array:");

        for (i = 0; i < a.length; i++)
         {
            a[i] = xyz.nextInt();
        }

        System.out.println("The Elements of Array are:");

        for (i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]);
        }

        System.out.println("Enter the index that you want to delete:");
        dt = xyz.nextInt();

       
            for (i = dt; i < a.length - 1; i++) 
            {
                a[i] = a[i + 1];
            }

            System.out.println("The new Array is:");
            for (i = 0; i < a.length - 1; i++)
            {
                System.out.println(a[i]);
            }
        
    }
}
