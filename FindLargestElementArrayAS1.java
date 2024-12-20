import java.util.*;
class FindMax
{
  int m[]=new int[6];
  int i,max=0;

  void setArray(int a[])
  {
    m=a;
  }

  int getMax()
  {
    max=m[0];
    for(i=0;i<m.length;i++)
      {
        if(m[i]>max)
         {
           max=m[i];
         }
      }
    return max;
  }
}

public class FindLargestElementArrayAS1
{
  public static void main(String x[])
   {
     int a[]=new int[6];
     FindMax fm=new FindMax();
  
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the Array Element");
     for(int i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }
     
     fm.setArray(a);
     
     int result=fm.getMax();
     System.out.printf("The maximum Number is %d",result);
   }
}