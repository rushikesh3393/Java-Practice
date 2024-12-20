/* Q8. Write program to create class name as Area with constructor overloading 
 Area(float radius): this function can accept radius as input and calculate circle Area
 Area(int len,int width): this function can accept len and width as input and calculate area of 
rectangle
 */
 
 import java.util.*;
 class Area
 {
   float rad;
   int len,width;
   float cirarea;
   int recarea;
   
   Area(float radius)
   {
	   rad=radius;
	   cirarea=3.14f*rad*rad;
	   System.out.printf("/nThe Area of Circle is:%f",cirarea);
   }
   
   Area(int len,int width)
   {
	   this.len=len;
	   this.width=width;
	   
	   recarea=len*width;
	   System.out.printf("\nThe Area of Rectangle is:%d",recarea);
   }
 }
 
 public class CalculateArea118
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 System.out.printf("Enter the Radius of Circle");
		 float radius=xyz.nextFloat();
		 
		 System.out.printf("Enter the Length and Width of rectangle");
		 int Length=xyz.nextInt();
		 int width=xyz.nextInt();
		 
		 Area ar=new Area(radius);
		 Area ar1=new Area(Length,width);
	 }
 }
		 
		 
	   