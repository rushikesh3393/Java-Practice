import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first side:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the second side:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the third side:");
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Triangle is equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Triangle is isosceles triangle");
        } else {
            System.out.println("Triangle is scalene triangle");
        }
    }
}
