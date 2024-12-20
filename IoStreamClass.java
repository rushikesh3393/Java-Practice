import java.util.*;
import java.io.*;

public class IoStreamClass 
{
	public static void main(String x[])throws Exception
	{
		File f=new File("F:\\Unit.txt");
		
		boolean b=f.createNewFile();
		
		if(b)
		{
			System.out.println("File creATED successfully");
		}
		else
		{
			
				System.out.println("File already exist");
		}
	}
}