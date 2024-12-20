import java.util.*;
public class WriteArmstrong 
{
    public static void main(String x[]) 
   {
        int n, i, count = 0, sum = 0, temp;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Value of n");
        n = xyz.nextInt();

        System.out.printf("The Armstrong Number from 1 to %d are:", n);
        for (i = 1; i <= n; i++) 
          {
            temp = i;
            sum = 0;
            count = 0;

           int num = i;
            while (num != 0) 
            {
                num =num / 10;
                count++;
            }

            num = i;
            while (num != 0)
            {
                int digit = num % 10;
                sum =sum+(int)Math.pow(digit, count);
                num =num/ 10;
            }

            if (sum == temp)
            {
                System.out.printf("%d ", temp);
            }
        }
    }
}
