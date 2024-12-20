import java.util.*;

public class FourthArray {

    public static void main(String x[])
      {
        int a[] = new int[5];
        int i, j; 
        boolean isUnique;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for (i = 0; i < 5; i++) 
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("Array Elements are:");
        for (i = 0; i < 5; i++) 
        {
            System.out.println(a[i]);
        }

    
        System.out.println("Unique Elements are:");
        for (i = 0; i < 5; i++)
           {
            isUnique = true;
             for (j = 0; j < 5; j++)
               {
                if (i != j && a[i] == a[j])
                  {
                    isUnique = false;
                    break;
                  }
               }

            if (isUnique) 
            {
                System.out.println(a[i]);
            }
        }
    }
}
