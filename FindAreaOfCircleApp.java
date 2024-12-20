import java.util.*;
class Circle
{
  float rad;
  
  void setRadius(float radius)
   {
     rad=radius;
   }

  void showArea()
   {
      float pi=3.14f;
      float Area=pi*rad*rad;
      
      System.out.printf("The Area of Circle is:%f",Area);
   }
}

public class FindAreaOfCircleApp
{
   public static void main(String x[])
    {
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter the Radius of Circle");
       float r=xyz.nextInt();

       Circle cr=new Circle();
       cr.setRadius(r);
       cr.showArea();
    }
}
