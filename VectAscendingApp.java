/*WAP to create Vector and store 5 student object in it and arrange all students in ascending order by using its id 
Note: without using comparable interface or comparator interface.*/

import java.util.*;
class Student
{
	private int id;
	private String name;
	private int contact;
	
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
	
	void setContact(int contact)
	{
		this.contact=contact;
	}
	int getContact()
	{
		return contact;
	}
}

public class VectAscendingApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		Vector<Student>v=new Vector<Student>();
		Student s[]=new Student[4];
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			
			System.out.printf("Enter the Student id,Name,contact");
			
			int id=xyz.nextInt();
			xyz.nextLine();
			
			String name=xyz.nextLine();
			int contact=xyz.nextInt();
			
			s[i].setId(id);
			s[i].setName(name);
			s[i].setContact(contact);
			
		v.add(s[i]);
		}
	
	
	System.out.printf("The Student Data Before Sorting");
	
	for(Student ss:v)
	{
		System.out.println("The id:"+ss.getId() +"    Name:"+ss.getName() +"     Conatct:"+ss.getContact());
	}
	
	for(int i=0;i<v.size();i++)
	{
		for(int j=i+1;j<v.size();j++)
		{
			Student s1=v.get(i);
			Student s2=v.get(j);
			
			if(s1.getId()>s2.getId())
			{
				Student temp=v.get(i);
				v.set(i,v.get(j));
				v.set(j,temp);
			}
		}
	}
	System.out.printf("The Student Data After Sorting \n");
	for(Student ss:v)
	{
		System.out.println("The id:"+ss.getId() +"    Name:"+ss.getName() +"     Conatct:"+ss.getContact());
	}
	
	}
}
	
	
			
		
	
		
		