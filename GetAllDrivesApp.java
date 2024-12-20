package FileclassUses;
import java.io.*;

public class GetAllDrivesApp
{
   public static void main(String[] args) 
	{
		File f[]=File.listRoots();
		
		for(int i=9;i<f.length;i++)
		{
			System.out.println(f[i]);
			
		}
	}

}
