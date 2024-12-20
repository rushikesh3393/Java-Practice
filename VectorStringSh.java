/* WAP to store the 10 string values in Vector and find the string those ends with sh  */
import java.util.*;
public class VectorStringSh
{
	public static void main(String x[])
	{
		Vector v=new Vector();
		
		v.add("Ramesh");
		v.add("Suresh");
		v.add("Ruturaj");
		v.add("Suresh");
		v.add("Ram");
		v.add("Shayam");
		v.add("Rushikesh");
		v.add("hari");
		v.add("ganesh");
		v.add("Raj");
		v.add("jayant");
		
		for (Object obj : v)
		{
            String str = (String) obj;
            if (str.length() >= 2 && str.endsWith("sh")) 
			{
                System.out.println(str);
            }
        }
	}
}
		
