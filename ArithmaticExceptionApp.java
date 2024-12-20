import java.util.*;

public class ArithmaticExceptionApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the Two Numbers");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		
		try
		{
		   int c=a/b;
		   System.out.printf("The Value of C is:%d",c);
		}
		
		catch(ArithmeticException ex)
		{
			
		   System.out.println("\nThe Error is:"+ex);
		}
		
		System.out.printf("\nAfter that print the Logics");
	}
}
			
		
