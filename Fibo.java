// import java.util.*;
// public class Fibo
// {
	// public static void main(String x[])
	// {
		// Scanner xyz=new Scanner(System.in);
		// System.out.printf("Enter the value of n");
		// int n=xyz.nextInt();
		
		// int num1=0,num2=1,sum=0;
		
		// for(int i=0;i<n;i++)
		// {
			// sum=num1+num2;
			
			// System.out.printf("%d \t",num1);
			
			// int temp=num1;
			// num1=num2;
			// num2=sum;
		// }
	// }
// }

import java.util.*;

public class Fibo {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.printf("Enter the value of n: ");
        int n = xyz.nextInt();
        
        // Call the recursive method to print the Fibonacci sequence up to n
        System.out.printf("Fibonacci sequence up to %d:\n", n);
        for(int i = 0; i < n; i++) {
            System.out.printf("%d \t", fibonacci(i));
        }
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }                     
}
