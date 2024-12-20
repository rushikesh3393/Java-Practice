import java.util.*;
public class MinDistance
 {
    public static void main(String x[])
     {
        int a[] = new int[8];
        int i, j;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Elements of Array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("The Elements of Array Are:");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t", a[i]);
        }

        System.out.println("\nEnter the First Number");
        int num1 = xyz.nextInt();

        System.out.println("Enter the Second Number");
        int num2 = xyz.nextInt();

        int mindiff = 9999;
        int difference = 9999;
        for (i = 0; i < a.length; i++) 
        {
            for (j = 0; j < a.length; j++) 
           {
                if ((num1 == a[i] && num2 == a[j]) || (num1 == a[j] && num2 == a[i])) 
                {
                    difference = Math.abs(i - j);
                }
                if (difference < mindiff) 
                {
                    mindiff = difference;
                }
            }
        }

        System.out.println("The Minimum Difference Is:" + mindiff);
    }
}
