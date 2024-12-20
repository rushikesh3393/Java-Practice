import java.util.*;
class Employee
{
  String Name;
  int Id;
  float BasicSal;
  int Progress;

  void setPersonalInfo(String name,int id,float basicsal)
    {
      Name=name;
      Id=id;
      BasicSal=basicsal;
    }

  void setProgressPer(int progress)
    {
      int Progress=progress;

      if(Progress>60)
        {
           BasicSal=BasicSal+BasicSal*30/100;
        }
     }
  
  void show()
     {
         System.out.printf("Name=%s \t Id=%d \t Basic_Salary=%f \t",Name,Id,BasicSal);
     }
}

public class EmployeeDetailFillingApp
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.printf("Enter the Name");
     String nm=xyz.nextLine();

     System.out.printf("Enter the id");
     int i=xyz.nextInt();

     System.out.printf("Enter the Basic salary");
     float bs=xyz.nextInt();

     System.out.printf("Enter the progress");
     int pg=xyz.nextInt();

     Employee em=new Employee();
     em.setPersonalInfo(nm,i,bs);
     em.setProgressPer(pg);
     em.show();
   }
}