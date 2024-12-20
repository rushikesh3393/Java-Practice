import java.util.*;
class MergeTwoArray
{
  int m[]=new int[10];
  int n[]=new int[5];
  int o[]=new int[5];
  int i;

  void mergeTwoArray(int a[],int b[])
   {
      n=a;
      o=b;
   }

   int [] getMergeArray()
   {
     for(i=0;i<m.length;i++)
       {
         if(i<5)
          {
            m[i]=n[i];
          }
         else
          {
            m[i]=o[i-5];
          }
       }
      return m;
    }
}

public class GettingMergedArrayAs3
{
  public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
      int a[]=new int[5];
      int b[]=new int[5];
      int c[]=new int[10];
      int i;

      MergeTwoArray mg=new MergeTwoArray();
   
      System.out.println("Enter the Value in First Array:");
      for(i=0;i<5;i++)
         {
           a[i]=xyz.nextInt();
         }

      System.out.println("Enter the Value in Second Array:");
      for(i=0;i<5;i++)
         {
           b[i]=xyz.nextInt();
         }

      mg.mergeTwoArray(a,b);
      
      c=mg.getMergeArray();
      System.out.println("The Merged Array is:");
      for(i=0;i<10;i++)
         {
           System.out.printf("%d \t",c[i]);
         }
     }
}

      


      
     