import java.util.*;

class Employee
{
  private int id;
  private String name;
  private int contact;
  
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
  public String  getname()
  {
	  return name;
  }
  
  public void setcontact(int contact)
  {
	  this.contact=contact;
  }
  public int getcontact()
  {
	  return contact;
  }
}

class Company
{
	Employee emp;
	
	void addnewemployee(Employee e)
	{
		emp=e;
	}
	
	void showemployee()
	{
		System.out.printf("\n Name:%s \n ID:%d \n CONTACt:%d",emp.getname(),emp.getid(),emp.getcontact());
	}
}

public class demo
{
  public static void main(String x[])
  {
	Scanner xyz=new Scanner(System.in);
	
	System.out.printf("Enter the id,name,contact");
	int id=xyz.nextInt();
	xyz.nextLine();
	String name=xyz.nextLine();
	int contact=xyz.nextInt();
	
	Employee ep=new Employee();
	ep.setid(id);
	ep.setname(name);
	ep.setcontact(contact);
	
	Company c=new Company();
	c.addnewemployee(ep);
	c.showemployee();
  }
}