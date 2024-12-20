import java.util.*;
public class Guards
{
  public static void main(String x[])
  {
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter number of Guards");
   int xx=xyz.nextInt();

   System.out.println("Enter number of Guards that want to manupulate");
   int yy=xyz.nextInt();

   if(xx>=yy)
   {
    System.out.println("YES");
   }

   else
   {
    System.out.println("NO");
   }
  }
}