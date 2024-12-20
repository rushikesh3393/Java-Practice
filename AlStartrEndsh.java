/*WAP to create ArrayList and Store 10 employee data in it means store 10 employee POJO class object in ArrayList and find the employee whose name start with r and end with sh*/

import java.util.*;
class Employee
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

public class AlStartrEndsh
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		
		Employee emp[]=new Employee[4];
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			
			System.out.println("Enter the Employee Id,Name,Contact");
			
			int id=xyz.nextInt();
			xyz.nextLine();
			
			String name=xyz.nextLine();
			int contact=xyz.nextInt();
			
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setContact(contact);
			
			al.add(emp[i]);
		}
		
		for (Employee employee :al) 
		{
            if (employee.getName().startsWith("r") && employee.getName().endsWith("sh")) 
			{
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Contact: " + employee.getContact());
               
            }
        }
	}
}	
			