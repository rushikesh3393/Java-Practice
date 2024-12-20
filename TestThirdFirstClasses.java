/* WAP to Create POJO class name as Employee with field id, name and salary and create array of object of size 5 and
 store data in employee objects and display it and input the id from keyboard and search employee data by using its id
 and if id found then display message employee is present otherwise show employee not present. */
 
 import java.util.*;
 class Employee
 {
    private int id;
	private String name;
	private int salary;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getsalary()
	{
		return salary;
	}
 }
 
 
 public class TestThirdFirstClasses
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 Employee e[]=new Employee[5];
		 
		 for(int i=0;i<e.length;i++)
		 {
			 e[i]=new Employee();
			 
			 System.out.printf("Enter the ID,Name,Salary of Employee");
			 int id=xyz.nextInt();
			 xyz.nextLine();
			 String name=xyz.nextLine();
			 int salary=xyz.nextInt();
			 
			 e[i].setid(id);
			 e[i].setname(name);
			 e[i].setsalary(salary);
		 }
		 
		 for(int i=0;i<e.length;i++)
		 {
			 System.out.printf("%d\t %s\t %d\t \n",e[i].getid(),e[i].getname(),e[i].getsalary());
		 }
		 
		 System.out.printf("Enter the Search Id");
		 int sid=xyz.nextInt();
		 boolean flag=false;
		 for(int i=0;i<e.length;i++)
		 {
			 if(sid==e[i].getid())
			 {
			      flag=true;
			 }
			
		 }
		 
		 if(flag==true)
		 {
			 System.out.printf("Employee Present");
		 }
		 else
		 {
			 System.out.printf("Employee NOT Present");
		 }
	 }
 }
			 
			 