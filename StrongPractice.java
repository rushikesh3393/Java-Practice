import java.util.*;
public class StrongPractice
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the Number");
		int num=xyz.nextInt();
		
		int sum=0;
		int fact=1;
		int count=0;
		int temp=num;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		for(int i=0;i<count;i++)
		{
			int rem=num%10;
			
			for(int j=1;j<=rem;j++)
			{
				fact=fact*j;
			}
			
			sum=sum+fact;
			num=num/10;
			fact=1;
		}
		
		if(sum==temp)
		{
			System.out.printf("%d is STRONG",temp);
		}
		else
			{
			System.out.printf("%d is NOT STRONG",temp);
		}
			
	}
}


