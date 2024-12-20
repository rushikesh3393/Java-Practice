/*Write program to create POJO class name as Employee with id,name and salary attribute and store data in object and retrieve data from object*/


import java.util.*;
class Employee
{
  private int id,salary;
  private String Name;

  public void setId(int id)
   {
     this.id=id;
   }
  public int getId()
   {
     return id;
   }

  public void setName(String Name)
   {
     this.Name=Name;
   }
  public String getName()
   {
      return Name;
   }

  public void setSalary(int salary)
   {
     this.salary=salary;
   }
  public int getSalary()
   {
      return salary;
   }
}

public class EmployeeInfoPas5
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     Employee ep=new Employee();

     System.out.printf("Enter the Employee id,Name,Salary");
     int Id=xyz.nextInt();
     xyz.nextLine();
     String name=xyz.nextLine();
     int Salary=xyz.nextInt();

     ep.setId(Id);
     ep.setName(name);
     ep.setSalary(Salary);

     System.out.printf("The Employee Detail:\n Id:%d\n Name:%s\n Salary:%d",ep.getId(),ep.getName(),ep.getSalary());
   }
}
