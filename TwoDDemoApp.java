import java.util.*;
public class TwoDDemoApp
{
    public static void main(String x[])
    {
	 int a[][][]=new int[3][3][3];
	 Scanner xyz  = new Scanner(System.in);
	System.out.println("Enter values in matrix");
	for(int i=0; i<a.length;i++)
	{
	   for(int j=0;j<a[i].length; j++)
	   {
                System.out.printf("\n The a[i] is:%d",a[i].length);
                for(int k=0;k<a[i][j].length;k++){
System.out.printf("\n The a[i] is:%d",a[i][j].length);
		  a[i][j][k]=xyz.nextInt();
		}
	   }
	}   
	System.out.println("display array values");
	for(int i=0; i<a.length; i++)
	{
	   for(int j=0;j<a[i].length;j++)
	   {
		for(int k=0; k<a[i][j].length;k++){
		 System.out.printf("%d\t",a[i][j][k]);
		}
		System.out.printf("\n");
	   }
	   System.out.printf("\n\n\n");
	}
    }
}
