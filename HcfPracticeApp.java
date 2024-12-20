import java.util.*;
public class HcfPracticeApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the First Number");
		int num1=xyz.nextInt();
		
		System.out.printf("Enter the Second Number");
		int num2=xyz.nextInt();
		
		int hcf=1;
		
	    for(int i=2;i<=num1;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
		
		System.out.printf("The HCF of Two Number is:%d",hcf);
	}
}