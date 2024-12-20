/* Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order. */
import java.util.*;
import java.util.function.*;
public class LamdaFifth
{
	public static void main(String x[])
	{
		List <String> str=Arrays.asList("Abc","Hdf","Dji","Pqr","Mno");
		
	
		Collections.sort(str,(a,b)-> a.compareToIgnoreCase(b));
		
		System.out.println(str);
	}
}
		
		
		
		
		