import java.util.*;
public class RemoteVolume
{
  public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the Initial volume");
   int xx=xyz.nextInt();

   System.out.println("Enter the Final volume");
   int yy=xyz.nextInt();


   if(yy>xx)
     {
       System.out.println((+yy)-(+xx));
     }

   if(yy<xx)
     {
       System.out.println((+xx)- (+yy));
     }
   }
}


