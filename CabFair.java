import java.util.*;
public class CabFair
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the First cab Service Charge");
    int xx=xyz.nextInt();

    System.out.println("Enter the Second cab Service Charge");
    int yy=xyz.nextInt();


    if(xx>yy)
     {
       System.out.println("Second");
     }

    if(xx<yy)
     {
       System.out.println("First");
     }

    if(xx==yy)
     {
       System.out.println("Any");
     }
   }
}




