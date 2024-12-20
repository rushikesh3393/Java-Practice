import java.io.*;

public class FileListsApp
{
    public static void main(String x[])
	{
		File f=new File("F:\\");
		
		File list[]=f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}
}