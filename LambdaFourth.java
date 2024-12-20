/* 4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.*/
/*import java.util.*;

interface Abc
{
	void check(Integer ig);
}

public class LambdaFourth
{
	public static void main(String x[])
	{
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		Abc a=(Integer ig)->{
				if(ig%2==0)
				{
					System.out.println(ig+"is even Number");
				}
				else
				{
					System.out.println(ig+"is ODD Number");
				}
			};
			
			 for (Integer num : l)
				 { 
                    a.check(num);
                 }
	}
}*/

import java.util.*;
import java.util.function.*;
public class LambdaFourth
{
	public static void main(String x[])
	{
		
		/*Predicate <Integer> p=(Integer t) ->  t%2==0;*/
		/*boolean result=((Predicate <Integer>) (Integer t) ->  t%2==0).test(100);*/
		if(((Predicate <Integer>) (Integer t) ->  t%2==0).test(100))
		{
			System.out.println("Even");
		}
		else{
			System.out.println("ODD");
		}
	}
}
			
	

		
		


		
