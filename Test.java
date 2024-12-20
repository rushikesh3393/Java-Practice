public class Test
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.Next();
			
			System.out.println(obj);
		}
	}
}
		