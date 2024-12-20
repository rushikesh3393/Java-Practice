import java.util.*;
public class PrimeFactorPractice
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the Number");
		int num=xyz.nextInt();
		int count=0;
		
		System.out.printf("The Prime Factors of number are");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				if(num%i==0)
				{
					System.out.printf("%d \n",i);
				}
			}
			
			count=0;
		}
		
	}
}
			
		
		
