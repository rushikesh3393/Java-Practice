import java.util.*;
public class ThirdArray
{
  public static void main(String x[])
  {
    int a[]=new int[5];
    int count=0;
    int i;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Array Elemnts:");
    for(i=0;i<5;i++)
     {
      a[i]=xyz.nextInt();
     }
  
    System.out.println("Array Elemnts are:");
    for(i=0;i<5;i++)
     {
      System.out.println(+a[i]);
     }

    for(i=0;i<5;i++)
    {
      for(int j=i+1;j<5;j++)
      {
        if(a[i]==a[j] && a[i]!=0)
          {
            count++;
            a[j]='0';
          }
      }
    }
    
    System.out.println("Duplicate Elemnts are:"+count);
  }
}
   