import java.io.*;

class Player implements Serializable
{
	private int id;
	private String name;
        private int run;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
}


public class SerializableApp
{
	public static void main(String x[])throws Exception
	{
		FileOutputStream fout=new FileOutputStream("G:\\SerializableFile");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		
		Player p=new Player();
		p.setId(1);
		p.setName("Rushikesh");
		p.setRun(1000);
		
		oout.writeObject(p);
		
		oout.close();
		fout.close();
		
	}
}
		
		