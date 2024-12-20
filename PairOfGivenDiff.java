import java.util.*;
public class PairOfGivenDiff
{
  public static void main(String x[])
   {
     int a[]=new int[5];
     int i,j,target;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the Elements of Array:");
     for(i=0;i<a.length;i++)
      {
        a[i]=xyz.nextInt();
      }
     System.out.println("The given Array is:");
      for(i=0;i<a.length;i++)
       {
         System.out.printf("%d \t",a[i]);
       }

    System.out.println("\nEnter the Difference");
    target=xyz.nextInt();
     
    boolean flag=false;
    for(i=0;i<a.length;i++)
      {
       for(j=i+1;j<a.length;j++)
        {
          if(a[j]-a[i]==target || a[i]-a[j]==target)
           {
             System.out.printf("\nThe pair Are:(%d %d)",a[i],a[j]);
             flag=true;
           }
        }
      }
       if(!flag)
           {
             System.out.println("\nThe pair Are Not Found");
           }
    }
}