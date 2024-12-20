import java.util.*;
public class ArmstrongPractice
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the Number");
		int num=xyz.nextInt();
		
		int count=0;
		
		int temp=num;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		
		num=temp;
		int sum=0;
		for(int i=0;i<count;i++)
		{
			sum=sum+(int)Math.pow(num%10,count);
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.printf("The %d is Armstrong",temp);
		}
		else
		{
			System.out.printf("The %d is NOT Armstrong",temp);
		}
		
	}
}
		
		