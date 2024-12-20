class Area
{
  int length,breadth,radius,base,height;
  float result, result1, result2;
  void calAreaCircle(int x)
   {
       radius=x;
       result=2*3.14f*radius;
   }

  void calRectangle(int x,int y)
   {
       length=x;
       breadth=y;
       result1=(float)x*y;
    }

  void caltriangle(int x,int y)
   {
      base=x;
      height=y;
      result2=(float)0.5*base*height;
   }

  void showArea()
   {
       System.out.println("\nThe Area of circle is:"+result);
       System.out.println("\nThe Area of Rectangle is:"+result1);
       System.out.println("\nThe Area of Triangle is:"+result2);
   }

public class FindArea
 {
     public static void main(String x[])
     {
         Area ar=new Area();

         ar.calAreaCircle(3);
         ar.calRectangle(5,4);
         ar.caltriangle(5,7);
         ar.showArea();
     }
}
 }