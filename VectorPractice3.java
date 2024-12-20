import java.util.*;

class Employee
{
	private int id;
	private String name;
	private String designation;
	private int salary;
	private String company;
	
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
	
	void setDesignation(String designation)
	{
		this.designation=designation;
	}
	String getDesignation()
	{
		return designation;
	}
	
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}

    void setCompanay(String company)
	{
		this.company=company;
	}
	String getCompany()
	{
		return company;
	}
}


public class VectorPractice3
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		Vector<Employee>v=new Vector<Employee>();
		
		Employee emp[]=new Employee[3];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			System.out.printf("Enter the id,name,designation,salary,company");
			
			int id=xyz.nextInt();
			xyz.nextLine();
			String name=xyz.nextLine();
			String designation=xyz.nextLine();
			int salary=xyz.nextInt();
			xyz.nextLine();
			String company=xyz.nextLine();
			xyz.nextLine();
			
			emp[i].setId(id);
			
				
			emp[i].setName(name);
			
			emp[i].setDesignation(designation);
			
			emp[i].setSalary(salary);
			
			emp[i].setCompanay(company);
			
			v.add(emp[i]);
			
			
			
		}
		
		System.out.println("The Employee data is:");
		for(Employee ee:v)
		{
		       System.out.println("Id:"+ee.getId()+"   Name:"+ee.getName()+"   Designation"+ee.getDesignation()+"    salary:"+ee.getSalary()+"   Company:"+ee.getCompany());
	}
}
}
