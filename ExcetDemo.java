import java.util.*;
public class ExcetDemo
{
  public static void main(String x[])
  {
	  Scanner xyz=new Scanner(System.in);
	  
	  System.out.printf("Enter the Two Value");
	  int a=xyz.nextInt();
	  int y=xyz.nextInt();
	  
	  try
	  {
		  int c=a/y;
		  System.out.printf("The Value of c iS:%d",c);
	  }
	  
	  catch(ArithmeticException ex)
	  {
		  System.out.println("The Error is"+ex);
	  }
	  
	  System.out.printf("\nLogic1");
	  System.out.printf("\nLogic1");
	  System.out.printf("\nLogic1");
  }
}
		  
	  
	  
 