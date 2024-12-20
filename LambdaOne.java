/* 1. Write a Java program to implement a lambda expression to find the sum of two integers. */

import java.util.*;

interface Abc
{
	void show(int f,int s);
}

public class LambdaOne
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int first=xyz.nextInt();
		
		System.out.println("Enter the  Second Number");
		int Second=xyz.nextInt();
		
		Abc a=(int f,int s)->{
				int result=f+s;
				System.out.println("The Sum is:"+result);
			};
		
		a.show(first,Second);
	}
}
		