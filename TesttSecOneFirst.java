import java.util.*;

public class TesttSecOneFirst
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the Number of rows");
		int rows=xyz.nextInt();
		
		System.out.printf("Enter the Number of columns");
		int columns=xyz.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(i<=6)
				{
					if(i>=j)
					{
						if(i%2!=0)
						{System.out.printf("%d",j);
						}
					}
				}
			}
		}
	}
}