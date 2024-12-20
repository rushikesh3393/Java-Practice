import java.util.*;

class Student
{
	private int id;
	private String name;
	private float percentage;
	private int standard;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
    public void setPercentage(float percentage)
	{
		this.percentage=percentage;
	}
	float getPercentage()
	{
		return percentage;
	}
	
	public void setStandard(int standard)
	{
		this.standard=standard;
	}
	int getStandard()
	{
		return standard;
	}
}


public class VectorPractice2
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Student s=new Student();
		
		System.out.printf("Enter the Student id,name,percentage,standard");
		s.setId(1);
		s.setName("Ram");
		s.setPercentage(90.60f);
		s.setStandard(10);
		
		Vector v=new Vector();
		
		v.add(s.getId());
		v.add(s.getName());
		v.add(s.getPercentage());
		v.add(s.getStandard());
		
		System.out.println("Student Data is:"+v);
	}
}
		
		