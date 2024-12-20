/*Q3. Write program to create class name as FindMax with two functions
void setArray(int a[]): this function is used for accept array as parameter
int getMax(): this function can find the max value from array and return it.*/

import java.util.*;
class FindMax
{
  int a[];

  void setArray(int arr[])
   {
     a=arr;
   }

  int getMax()
   {
     int max=a[0];

     for(int i=0;i<a.length;i++)
     {
       if(a[i]>max)
         {
           max=a[i];
         }
     }
     return max;
   }
}

public class FindMaxPas3
{
  public static void main(String x[])
  {
  Scanner xyz=new Scanner(System.in);
  FindMax fm=new FindMax();

  int arr[]=new int[5];
  System.out.printf("Enter the Array Elements");
  for(int i=0;i<arr.length;i++)
   {
     arr[i]=xyz.nextInt();
   }

   fm.setArray(arr);
   int result=fm.getMax();

   System.out.printf("The Maximun number from Array is:%d",result);
   }
}
