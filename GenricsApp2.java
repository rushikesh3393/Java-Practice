import java.util.*;

public class GenricsApp2
{
	public static void main(String x[])
	{
		ArrayList <Integer>al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(23);
		al.add(30);
		al.add(40);
		
		int oddsum=0;
		int evensum=0;
		
		
		
		for (int i = 0; i < al.size(); i++)
			{
               if (al.get(i)%2==0)
				{
				   evensum=evensum+al.get(i);
			    }
			   else
			    {
				    oddsum=oddsum+al.get(i);
			    }
		}
		
		System.out.println("The EvenSum is:"+evensum);
		System.out.println("\nThe OddSum is:"+oddsum);
	}
}