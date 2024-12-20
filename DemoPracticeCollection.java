import java.util.*;

public class DemoPracticeCollection
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		/*int size=al.size();
		
		System.out.println(size);*/
		
		/*boolean b=al.isEmpty();
		
		if(b)
		{
			System.out.printf("Empty");
		}
		else
		{
			System.out.printf(" NOT Empty");
		}*/
		
		/*boolean b=al.contains(30);
		
		if(b)
		{
			System.out.printf("Present");
		}
		else
		{
			System.out.printf(" NOT Present");
		}*/
		
		Object obj[]=al.toArray();
		
	       for(int i=0;i<obj.length;i++)
		   {
			   System.out.printf("%d \t",obj[i]);
		   }
	
	}
}

