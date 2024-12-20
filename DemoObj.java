import java.util.*;

public class DemoObj
{
	public static void main(String x[])
	{
		Object obj[]=new Object[4];
		
		obj[0]="Rushikesh";
		obj[1]="14";
		obj[2]=new java.util.Date();
		obj[3]="12.5f";
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	}
}
