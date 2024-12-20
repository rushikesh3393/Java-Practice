import java.io.*;

public class GettingAllDrivesApp
{
   public static void main(String x[]) 
	{
		File f[]=File.listRoots();
		
		for(int i=9;i<f.length;i++)
		{
			System.out.println(f[i]);
			
		}
	}

}
