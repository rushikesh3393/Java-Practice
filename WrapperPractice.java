public class WrapperPractice
{
	public static void main(String x[])
	{
		String s="Rushikesh,Rajesh,Ganesh,Ram,Shayam,Anna,mangesh";
		
		String shh[]=s.split(",");
		
		for(String ss:shh)
		{
			boolean b=ss.endsWith("sh");
			
			if(b)
			{
				System.out.println(ss);
			}
			
		
		
		
		}			
		

	}
}