/* Write a program in java to read an existing file.
Test Data :
Input the file name to be opened : test.txt
Expected Output :

 The content of the file test.txt is  :                                                                       
This is the content of the file test.txt. */

import java.io.*;
public class Question2FileHandeling
{
	public static void main(String x[])throws FileNotFoundException,IOException,InterruptedException
	{
        FileReader fr = new FileReader("F:\\test.txt");
		
		BufferedReader br= new BufferedReader(fr);
		
		String  data;
		
		while((data=br.readLine())!=null)
		{
		   System.out.println(data);
		   Thread.sleep(1000);
		}
		System.out.println(data);
	}
}

