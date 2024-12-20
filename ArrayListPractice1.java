import java.util.*;
public class ArrayListPractice1
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Object obj:al)
		{
			System.out.println(obj);
		}
	}
}