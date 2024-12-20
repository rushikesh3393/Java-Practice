import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class EndsWithShStreamApi
{
	public static void main(String x[])
	{
		List <String>list=Arrays.asList("Rushikesh","Rahul","Sachin","Rehan","Ganesh","Suresh");
		
		Stream <String> s=list.stream();
		
		Predicate <String> p=new Predicate<String>(){
			public boolean test(String t)
			{
				return t.endsWith("sh");
			}
		};
		
		Stream <String> s1=s.filter(p);
		
		List <String> newList=s1.collect(Collectors.toList());
		
		Consumer <String> c=new Consumer<String>(){
			public void accept(String t)
			{
				System.out.println(t);
			}
		};
		
		newList.forEach(c);
	}
}
		
		