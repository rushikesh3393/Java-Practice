import java.util.*;

public class RootOfQuadraticEquation 
{
    public static void main(String x[])
 {
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = xyz.nextInt();

        System.out.println("Enter the value of b");
        int b = xyz.nextInt();

        System.out.println("Enter the value of c");
        int c = xyz.nextInt();

        float z = (float) Math.sqrt(b * b - 4 * a * c);

        float root1 = (-b + z) / (2 * a);
        float root2 = (-b - z) / (2 * a);

        System.out.printf("The roots of quadratic equation are: %.2f and %.2f", root1, root2);
    }
}
