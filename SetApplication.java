import java.util.*;

public class SetApplication
{
	public static void main(String x[])
	{
		HashSet hs=new HashSet();
		
		hs.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6}));
		
		HashSet ht=new HashSet();
		ht.addAll(Arrays.asList(new Integer[]{3,4,6,7,8}));
		
		Set union=new HashSet(hs);
		union.addAll(ht);
		System.out.println("The union is:"+union);
		 
		 Set intersection=new HashSet(hs);
		 intersection.retainAll(ht);
		 System.out.println("The intersection is:"+intersection);
		 
		 Set difference=new HashSet(hs);
		 difference.removeAll(ht);
		 System.out.println("The differcence is:"+difference);
	}
}