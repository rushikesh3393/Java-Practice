/* Write program to create POJO class name as Employee with id,name and salary attribute and 
store data in object and retrieve data from object
 */
 
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
	 
public class SimplePojo116
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("Enter the id, Name and Salary");
        int ID=xyz.nextInt();
		xyz.nextLine();
        String Name=xyz.nextLine();
		
        int Salary=xyz.nextInt();

        Employee em=new Employee();
		
		em.setid(ID);
		em.setname(Name);
		em.setsalary(Salary);
		
		System.out.printf("\n Id:%d \n Name:%s \n Salary:%d",em.getid(),em.getname(),em.getsalary());
	}
}