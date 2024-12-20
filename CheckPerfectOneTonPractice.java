import java.util.*;
public class CheckPerfectOneTonPractice
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the Number");
		int n=xyz.nextInt();
		int sum=0;
		int num=0;
	  for(int j=1;j<=n;j++)
	   {
		   num=j;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
			  sum=sum+i;
			}
		}
		
		if(sum==num)
		{
			System.out.printf("%d \t",num);
		}
		
		sum=0;
	   }
	}
}