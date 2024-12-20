import java.util.*;
public class TwoDArray
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][3];
	 Scanner xyz = new Scanner(System.in);

	 System.out.println("Enter values in matrix");
	 for(int i=0; i<a.length;i++)
	 {
	   for(int j=0;j<a[i].length; j++)
	   {
		a[i][j]=xyz.nextInt();
	   }
	 }   
	 System.out.println("display array values");
	 for(int i=0; i<a.length; i++)
	 {
	   for(int j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",a[i][j]);
	   }
	    System.out.printf("\n");
	}
    }
}
