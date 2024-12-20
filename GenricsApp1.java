import java.util.*;
public class GenricsApp1
{
	public static void main(String x[])
	{
		ArrayList<Integer>aa=new ArrayList<Integer>();
		
		aa.add(10);
		aa.add(20);
		aa.add(30);
		aa.add(40);
		aa.add(50);
		
		ArrayList<Integer>ab=new ArrayList<Integer>();
		
		ab.add(10);
		ab.add(20);
		ab.add(30);
		ab.add(40);
		ab.add(50);
		
		
		boolean b=true;
		for (int i = 0; i < aa.size(); i++)
			{
              if (aa.get(i)!=(ab.get(i)))
				{
                   b = false;
                   break; 
                }
            }
		
		if(b==true)
		{
			System.out.println("Both Strings Are equal");
		}
		else
		{
			System.out.println("Both Strings Are NOT Equal");
		}
	}
}
			
				
		
		
		
		
