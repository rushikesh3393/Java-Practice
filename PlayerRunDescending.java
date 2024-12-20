/* WAP to create ArrayList and store 10 player objects in it and find the player detail according to run and arrange run in descending order. */


import java.util.*;
class Player
{
	private int id;
	private String name;
	private int run;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
	void setRun(int run)
	{
		this.run=run;
	}
	int getRun()
	{
		return run;
	}
}

public class PlayerRunDescending
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		ArrayList<Player>al=new ArrayList<Player>();
		Player p[]=new Player[4];
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Player();
			
			System.out.printf("Enter the Player id,Name,Run");
			
			int id=xyz.nextInt();
			xyz.nextLine();
			
			String name=xyz.nextLine();
			int run=xyz.nextInt();
			
			p[i].setId(id);
			p[i].setName(name);
			p[i].setRun(run);
			
		    al.add(p[i]);
		}
	
	
	System.out.printf("The player Data Before Sorting");
	
	for(Player ss:al)
	{
		System.out.println("The id:"+ss.getId() +"    Name:"+ss.getName() +"     Run:"+ss.getRun());
	}
	
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size();j++)
		{
			Player p1=al.get(i);
			Player p2=al.get(j);
			
			if(p1.getRun()<p2.getRun())
			{
				Player temp=al.get(i);
				al.set(i,al.get(j));
				al.set(j,temp);
			}
		}
	}
	System.out.printf("The Player Data After Sorting \n");
	for(Player ss:al)
	{
		System.out.println("The id:"+ss.getId() +"    Name:"+ss.getName() +"     Run:"+ss.getRun());
	}
	}
}