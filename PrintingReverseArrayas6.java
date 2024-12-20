import java.util.*;
class Reverse
{
  int m[]=new int[5];
  void setArray(int a[])
   {
     m=a;
   }

  int[] getSortArray()
   {
      for(int i=0;i<m.length/2;i++)
        {
         int temp=m[i];
         m[i]=m[4-i];
         m[4-i]=temp;
        }
      return m;
   }
}

public class PrintingReverseArrayas6
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);  
     int a[]=new int[5];

     System.out.println("Enter the Values of Element:");
     for(int i=0;i<a.length;i++)
       {
         a[i]=xyz.nextInt();
       }

     Reverse rv=new Reverse();
     rv.setArray(a);
     a=rv.getSortArray();

    System.out.println("The Reverse Array is:");
     for(int i=0;i<a.length;i++)
       { 
          System.out.printf("%d \t",a[i]);
       }
   }
}

 