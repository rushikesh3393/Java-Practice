import java.util.*;
class SortArr
{
  int m[]=new int[8];
  int i,j,temp=0;

  void setArray(int a[])
  {
    m=a;
  }

  int[] getSortArray()
   {
     for(i=0;i<m.length;i++)
      {
        for(j=i+1;j<m.length;j++)
         {
            if(m[j]<m[i])
              {
                 temp=m[i];
                 m[i]=m[j];
                 m[j]=temp;
              }
         }
      }
     return m;
    }
}

public class SortingTheArrayElementsAs2
{
  public static void main(String x[])
   {
      int a[]=new int[8];
      Scanner xyz=new Scanner(System.in);
      
      SortArr sr=new SortArr();

      System.out.println("Enter the Array Element");
      for(int i=0;i<a.length;i++)
      {
        a[i]=xyz.nextInt();
      }
   
      sr.setArray(a);
      a=sr.getSortArray();

      System.out.println("The Sorted Array is:");
     for(int i=0;i<a.length;i++)
      {
        System.out.printf("%d \t",a[i]);
      }
    }
}
      