import java.util.*;
public class SecondArray
{
  public static void main(String x[])
  {
   int a[]=new int[5];
   int sum=0;
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the Five Elements:");
   for(int i=0;i<5;i++)
    {
      a[i]=xyz.nextInt();
    }
  
   System.out.println("The Elements of Array Are");
    for(int i=0;i<5;i++)
    {
      System.out.println(+a[i]);
    }

    for(int i=0;i<5;i++)
    {
      sum=sum+a[i];
    }

   System.out.println("The sum of Elements of Array Are"+sum);
   }
}
