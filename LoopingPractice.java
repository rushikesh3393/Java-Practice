import java.util.*;
public class LoopingPractice
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the Value of N");
		int n=xyz.nextInt();
		
		int num1=0;
		int num2=1;
		
		for(int i=0;i<n;i++)
		{
			int sum=num1+num2;
			
			System.out.printf("%d \t",num1);
			
			int temp=num1;
			num1=num2;
			num2=sum;
		}
		
	}
}