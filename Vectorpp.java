import java.util.*;
public class Vectorpp
{
   public static void main(String x[])
   {       Vector v = new Vector(3,2);
	  int defaultCapacity=v.capacity();
	  System.out.println("Default capacity of Vector is "+defaultCapacity);
	   v.add(10);
	   v.add(20);
	   v.add(30);//3
	   /*v.add(40); //5	
	   v.add(50); //5
	   v.add(60);//7
	   v.add(60);//7
	   v.add(70);//9
	   v.add(80);
	   v.add(100);//11*/
	   
	   System.out.println("Vector data is "+v);
	   System.out.println("Now Capacity of Vector is "+v.capacity());
   }
}