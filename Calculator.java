import java.util.*;

public class Calculator {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        int z;
        
        do {
            System.out.println("\nEnter the choice for 1.Addition  2.Subtraction  3.Multiplication  4.Division ");
            System.out.println("\nEnter the choice");
            int choice = xyz.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the first Number");
                    int first = xyz.nextInt();

                    System.out.println("Enter the Second Number");
                    int second = xyz.nextInt();

                    int result = first + second;
                    System.out.println("The Addition of two number is:" + result);
                    break;
                }

                case 2: {
                    System.out.println("Enter the first Number");
                    int first = xyz.nextInt();

                    System.out.println("Enter the Second Number");
                    int second = xyz.nextInt();

                    int result = first - second;
                    System.out.println("The Subtraction of two number is:" + result);
                    break;
                }

                case 3: {
                    System.out.println("Enter the first Number");
                    int first = xyz.nextInt();

                    System.out.println("Enter the Second Number");
                    int second = xyz.nextInt();

                    int result = first * second;
                    System.out.println("The Multiplication of two number is:" + result);
                    break;
                }

                case 4: {
                    System.out.println("Enter the first Number");
                    int first = xyz.nextInt();

                    System.out.println("Enter the Second Number");
                    int second = xyz.nextInt();

                    float result = (float) first / second; // cast one of the operands to float to get float division
                    System.out.println("The Division of two numbers is:" + result);
                    break;
                }
            }
            System.out.println("if you want to continue press 1 if not press 2");
            z = xyz.nextInt();
        } while (z == 1);
    }
}
