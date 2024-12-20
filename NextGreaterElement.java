import java.util.*;
public class NextGreaterElement
{
 public static void main(String x[])
  {
    int a[]=new int[8];
    int i,j;

    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Array Element");
    for(i=0;i<a.length;i++)
       {
         a[i]=xyz.nextInt();
       }

    System.out.println("The Given Array is");
    for(i=0;i<a.length;i++)
       {
         System.out.printf("%d \t",a[i]);
       }

    for(i=0;i<a.length;i++)
    {
      boolean flag=false;
     for(j=i+1;j<a.length;j++)
       {
         if(a[j]>a[i])
           {
             System.out.printf("\n Next Greater Element of %d is %d ",a[i],a[j]);
             flag=true;
             break;
           }
        
       }
      
      if(!flag)
           {
             System.out.printf("\n Next Greater Element of %d is -1",a[i]);
           }
        
     }
    }
}
