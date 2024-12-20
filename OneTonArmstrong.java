import java.util.*;
public class OneTonArmstrong
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the Number");
		int n=xyz.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			
			int num=i;
			int temp=num;
			while(num>0)
			{
				count++;
				num=num/10;
			}
			
			num=temp;
			
			int sum=0;
			
			for(int j=0;j<count;j++)
			{
			   sum=sum+(int)Math.pow(num%10,count);
			   num=num/10;
			}
			
			if(sum==temp)
			{
				System.out.printf("%d \n",sum);
			}
		}
	}
}