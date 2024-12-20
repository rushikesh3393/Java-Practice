/* Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area
 and perimeter of each shape. */
 
 abstract class Shape
 {
   public abstract float calculateArea();
  
   public abstract float calculatePerimeter();
 }
 
 class Circle extends Shape
 {
	 private int rad;

         Circle(int rad) 
		 {
           this.rad= rad;
         }

         public float calculateArea()
		 {
		   return 3.14f*rad*rad;
		 }
		 
		 public float calculatePerimeter()
		 {
		   return 2*3.14f*rad;
		 }
 
 }
 
 class Triangle extends Shape
 {
	     private int base, height, side1, side2, side3;

         Triangle(int base, int height, int side1, int side2, int side3)
		 {
          this.base = base;
          this.height = height;
          this.side1 = side1;
          this.side2 = side2;
          this.side3 = side3;
         }
		 
         public float calculateArea()
		 {
		   return 1/2f*base*height;
		 }
		 
		 public float calculatePerimeter()
		 {
		   return side1+side2+side3;
		 }
 }
 
 public class FindAreaPerimeterAbs
 {
   public static void main(String x[])
   {
      Shape cir=new Circle(20);
	  Shape tri=new Triangle(20,30,20,30,40);
	  

	  System.out.println(cir.calculateArea());
	   System.out.println("\n");
	  System.out.println(cir.calculatePerimeter()); 
	  System.out.println("\n");
	  System.out.println(tri.calculateArea());
	  System.out.println("\n");
	  System.out.println(tri.calculatePerimeter());
   }
}