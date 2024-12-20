import java.util.*;
class FindEvenNo
{
   int a[]=new int[8];
   int i;

   void setArray(int arr[])
    {
      a=arr;
    }

   int max=a[0];
   void maxArray()
     {
       for(i=0;i<a.length;i++)
          {
            if(a[i]>max)
              {
                max=a[i];
              }
           }
       System.out.printf("\nThe maximum Number Is:%d",max);
     }
   
   
   void minArray()
     {
        int min=a[0];
        for(i=1;i<a.length;i++)
          {
            if(a[i]<min)
              {
                min=a[i];
              }
           }
       System.out.printf("\nThe minimum Number Is:%d",min);
     }
}

public class FindOutMaxMinArrayAs8
{
  public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
      int arr[]=new int[8];

       System.out.println("Enter the Elements Of Array");
       for(int i=0;i<arr.length;i++)
         {
            arr[i]=xyz.nextInt();
         }
      FindEvenNo fn=new FindEvenNo();
      fn.setArray(arr);
      fn.minArray();
      fn.maxArray();
    }
}