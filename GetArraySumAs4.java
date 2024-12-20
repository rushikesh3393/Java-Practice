import java.util.*;
class ArrSum
{
  protected int m[]=new int[5];

  void setValue(int arr[])
   {
     m=arr;
   }
}

class Getsum extends ArrSum
{
  int getArrSum()
 {
  int sum=0;
  for(int i=0;i<m.length;i++)
   {
      sum=sum+m[i];
   }
   return sum;
 }
}

public class GetArraySumAs4
{
  public static void main(String x[])
  {
    int a[]=new int[5];
    Scanner xyz=new Scanner(System.in);

    System.out.println("Enter the Array Elements:");
    for(int i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }

    Getsum as=new Getsum();
    as.setValue(a);
    int sum=as.getArrSum();

    System.out.printf("The Sum of Array Elements is:%d",sum);
   }
}
      
   