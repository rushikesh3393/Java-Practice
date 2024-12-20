import java.io.*;

public class CreateFolder
{
	public static void main(String x[])
	{
	File f=new File("F:\\Demo");
	
	boolean b=f.mkdir();
	
	if(b)
	{
		System.out.printf("Folder Created SuccessFully");
	}
	
	boolean bg=f.exists();
	
	if(bg)
	{
		System.out.printf("Folder already exists");
	}
	else
	{
		System.out.printf("There is some problem");
	}
	
}
}