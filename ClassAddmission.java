import java.util.*;
public class ClassAddmission
{
 public static void main(String x[])
  {
   Scanner xyz=new Scanner(System.in);


   System.out.println("Enter no of Students in a friend Group");
   int nn=xyz.nextInt();

   System.out.println("Enter Class Capacity");
   int mm=xyz.nextInt();

   System.out.println("Enter no of Students Alredy Registered ");
   int kk=xyz.nextInt();

   if(mm-(kk+nn)>=0)
   {
     System.out.println("YES");
   }

   else
   {
     System.out.println("NO");
   }
}
}

