import java.util.*;
public class CommonElement
{
  public static void main(String x[])
   {
    int a[]=new int[5];
    int b[]=new int[5];
    int i,j;

    Scanner xyz=new Scanner(System.in);


    System.out.println("Enter the elements of First Array");

    for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }


    System.out.println("The elements of Array Are:");

    for(i=0;i<a.length;i++)
     {
       System.out.println(+a[i]);
     }

    System.out.println("Enter the elements of Second Array");

    for(i=0;i<b.length;i++)
     {
       b[i]=xyz.nextInt();
     }


    System.out.println("The elements of Array Are:");

    for(i=0;i<b.length;i++)
     {
       System.out.println(+b[i]);
     }
  

    System.out.println("The common Elements Are:");

    for(i=0;i<a.length;i++)
       {
      for(j=0;j<b.length;j++)
         {
         if(a[i]==b[j])
           {
             System.out.println(+a[i]);
           }
         }
       }
    }
}






    