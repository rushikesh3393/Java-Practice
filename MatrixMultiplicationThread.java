import java.util.*;
/*
Write a Java program that performs matrix multiplication using multiple threads.
Write a Java program that sorts an array of integers using multiple threads.
Write a C program to find all prime factors of a number using runnable interface
Write a  program to enter the  String and  print the  pattern using runnable interface 
h
e l
l o M
y N a m 
e i s A j
a y D e s h m 
u k h i a m f r
o m s a n g l i .
*/
class MatrixMultiplocation extends Thread
{
	public void run()
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in first array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Enter value in second array:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j] = sc.nextInt();
			}	
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j] = a[i][j]*b[i][j];
			}	
		}
		try
		{
			System.out.println("multiplication is:");
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c.length;j++)
				{
					System.out.print(" "+c[i][j]);
					Thread.sleep(1000);
				}
				System.out.println();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)	
		{
			System.out.println("Error is"+e);
		}
	}
}
public class MatrixMultiplicationThread
{
	public static void main(String arr[])
	{
		MatrixMultiplocation m = new MatrixMultiplocation();
		m.start();
	}
}