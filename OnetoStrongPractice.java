import java.util.*;
public class OnetoStrongPractice
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the Number");
		int n=xyz.nextInt();
		
		for(int k=1;k<n;k++)
		{
		int sum=0;
		int fact=1;
		int count=0;
		int num=k;
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
			System.out.printf("%d \n",temp);
		}
		sum=0;
	    fact=1;
		}
	
	}
}


