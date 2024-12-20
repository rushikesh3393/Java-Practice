import java.util.*;

public class MergeArrayAndDescending
   {
    public static void main(String x[]) 
      {
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[6];
        int i, l, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of First Array:");
        for (i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the Elements of Second Array:");
        for (i = 0; i < b.length; i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println("After merging Elements of Array:");
        for (i = 0; i < 6; i++) 
          {
            if (i < 3)
            {
                c[i] = a[i];
            } 
           else 
            {
                c[i] = b[i - 3];
            }
            System.out.println(c[i]);
        }

        for (i = 0; i < 6; i++) 
           {
            for (l = i + 1; l < 6; l++) 
              {
                if (c[i] < c[l])
                {
                    temp = c[i];
                    c[i] = c[l];
                    c[l] = temp;
                }
            }
        }

        System.out.println("\nNumbers in descending order are:");
        for (i = 0; i < 6; i++) {
            System.out.println(c[i]);
        }
    }
}