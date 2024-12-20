import java.io.*;

public class FindDriveApp
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}