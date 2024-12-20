import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first angle:");
        int angle1 = scanner.nextInt();
        System.out.println("Enter the second angle:");
        int angle2 = scanner.nextInt();
        System.out.println("Enter the third angle:");
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("Valid triangle.");
        } else {
            System.out.println("Invalid triangle.");
        }
    }
}
