abstract class Area{
	abstract void showArea();
}

class Circle extends Area{
	int radius;
	void setRadius(int rad) {
		radius = rad;
	}
	
	@Override
	void showArea() {
		double  areaOfCircle = 3.15 * radius * radius ;
		System.out.println("Area of Circle: "+areaOfCircle);
	}
	
}

class Rectangle extends Area{
	int length,width;
	void setlengthWidth(int len, int wid) {
		length =  len;
		width  = wid;
	}
	@Override
	void showArea() {
		double areaOfRectangle = length* width;
		System.out.println("Area of Rectangle: "+areaOfRectangle);
	}
	
}
public class AreaApplicationIht {
	public static void main(String []args) {
		Circle circle = new Circle();
		circle.setRadius(5);
		circle.showArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setlengthWidth(12,5);
		rectangle.showArea();
	}
}