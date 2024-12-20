import java.util.*;
public class PrintStrongNumber
 {
    public static void main(String x[])
   {
        int n, fact, i, sum, temp, rem, k;

        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter the n:");
        n = xyz.nextInt();

        System.out.printf("The Strong Number from 1 to %d are:", n);

        for (k = 0; k <= n; k++) 
          {
            temp = k;
            sum = 0;
            int num = k;

            while (num != 0) 
              {
                rem = num % 10;
                fact = 1;
                for (i = 1; i <= rem; i++) 
                {
                    fact = fact * i;
                }
                sum = sum + fact;
                num = num / 10;
            }

            if (sum == temp) 
            {
                System.out.printf("%d is Strong number\n", temp);
            }
        }
    }
}
