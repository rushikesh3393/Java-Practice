/* Write program to create class name as SortArr with two functions
void setArray(int a[]): this function can accept array as parameter
int [] getSortArray(): this function can perform sorting on array and return sorted array */

import java.util.*;
class SortArr
{

  int a[]=new int[5];
  void setArray(int a[])
   {
     this.a=a;
   }

  int [] getSortArray()
   { 
       for (int i = 0; i < a.length - 1; i++) 
       {
            for (int j = 0; j < a.length - i - 1; j++) 
             {
                if (a[j] > a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
       return a;
    }
}

public class SortArrayPas4
{
  public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
      int b[]=new int[5];
      System.out.printf("Enter the Array Elements:");
      for(int i=0;i<b.length;i++)
         {
           b[i]=xyz.nextInt();
         }
      
      SortArr sr=new SortArr();
      sr.setArray(b);
      
       b=sr.getSortArray();
      System.out.printf("Array Elements after Sorting is:");
      for(int i=0;i<b.length;i++)
         {
           System.out.printf("%d \t ",b[i]);
         }
    }
}