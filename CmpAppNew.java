import java.util.*;

class Studentss
{
	private int id;
	private String name;
	private int per;
	
	public Studentss()
	{
		
	}
	
	public Studentss(int id,String name,int per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
	
}

class SortById() implements Comparator{
	public int compare(Object o,Object o1)
	{
		Studentss s=(Studentss) o;
		Studentss s1=(Studentss) o1;
		
		if(s.getId()>s1.getId())
		{
			return 1;
		}
		if(s.getId()<s1.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
}

class SortByPer() implements Comparator

{
	public int compare(Object o,Object o1)
	{
		Studentss s=(Studentss) o;
		Studentss s1=(Studentss) o1;
		
		if(s.getPer()>s1.getPer())
		{
			return 1;
		}
		else if(s.getPer()<s.getPer())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}


public class CmpAppNew 
{

	public static void main(String[] args) 
	{
		ArrayList<Studentss> al=new ArrayList<Studentss> ();
		Studentss s1=new Studentss(4,"Ruturaj",90);
		Studentss s2=new Studentss(5,"Rupesh",70);
		Studentss s3=new Studentss(3,"Rushikesh",85);
		Studentss s4=new Studentss(1,"Rutuja",60);
		Studentss s5=new Studentss(2,"Rucha",67);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		

		System.out.println("Students Before Sorting");
		for(Object obj:al)
		{
			Studentss s=(Studentss) obj;
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getPer());
		}
		
		SortById si=new SortById();
		
		Collections.sort(al,si);
		System.out.println("\n Students After Sorting by id");
		for(Object obj:al)
		{
			Studentss st=(Studentss) obj;
			System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getPer());
		}
		
		
		SortByPer sp=new SortByPer();
		
		Collections.sort(al,sp);
		System.out.println("\n Students After Sorting by percentage");
		for(Object obj:al)
		{
			Studentss st=(Studentss) obj;
			System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getPer());
		}
		

	}

}