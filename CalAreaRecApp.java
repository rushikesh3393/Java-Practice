import java.util.*;
class Rectangle
{
  int length;
  int width;

  void setRectangleWidth(int len,int wid)
   {
      length=len;
      width=wid;
   }

  void showArea()
   {
      int Area=length*width;

      System.out.printf("The area of Rectangle is:%d",Area);
   }
}
public class CalAreaRecApp
{
  public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the length of Rectangle");
      int l=xyz.nextInt();

      System.out.println("Enter the Width of Rectangle");
      int w=xyz.nextInt();

      Rectangle rc=new Rectangle();
      rc.setRectangleWidth(l,w);
      rc.showArea();
   }
}
