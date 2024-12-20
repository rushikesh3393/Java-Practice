import java.util.Scanner;

public class QuadraticRoots
 {
    public static void main(String[] args) 
      {
        Scanner xyz = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = xyz.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = xyz.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = xyz.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) 
           {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
           } 

       else if (discriminant == 0) 
        {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } 

       else 
        {
            System.out.println("No real roots exist.");
        }
        
       
    }
}
