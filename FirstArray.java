import java.util.*;
public class FirstArray
{
  public static void main(String x[])
  {
    int a[]=new int[5];
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Array Elements");

    for(int i=0;i<5;i++)
      {
         a[i]=xyz.nextInt();
      }

    System.out.println("Elements of array Are");
 
     for(int i=0;i<5;i++)
      {
         System.out.println(+a[i]);
      }
    }
}

        