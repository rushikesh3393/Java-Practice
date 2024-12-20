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


public class DeSerializableApp
{
	public static void main(String x[])throws Exception
	{
		FileInputStream fin=new FileInputStream("G:\\SerializableFile");
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		Object obj=oin.readObject();
		
		if(obj!=null)
		{
			Player p=(Player) obj;
			System.out.println("Id:"+p.getId()+"\t"+"Name:"+p.getName()+"\t"+p.getRun());
		}
		
		else
		{
			System.out.println("Data Not Found");
		}
			
		
		oin.close();
		fin.close();
		
	}
}
		
		