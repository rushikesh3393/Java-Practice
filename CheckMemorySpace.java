import java.io.*;

public class CheckMemorySpace
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		
		for(int i=0;i<f.length;i++)
		{
			long TotalSpace=f[i].getTotalSpace();
			long FreeSpace=f[i].getFreeSpace();
			
			System.out.println(f[i]+"\tThe Total space is in: GB" +(TotalSpace/1073741824) +"\tThe Free Space is: GB" +(FreeSpace/1073741824));
		}
	}
}