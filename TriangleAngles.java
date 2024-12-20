import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();

        int angle3 = 180 - angle1 - angle2;

        System.out.println("Third angle = " + angle3);
    }
}
