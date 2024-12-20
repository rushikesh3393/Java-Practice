import java.util.*;
public class MajorityElement
{
  public static void main(String x[])
   {
     int a[]=new int[6];
     int i,j;
     
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Elements of array");
     
     for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }

     System.out.println("Elements of array Are");
     
     for(i=0;i<a.length;i++)
     {
       System.out.println(+a[i]);
     }
 
      int count=1,maxcount=0,maxnum=-1;

      for(i=0;i<a.length;i++)
      {
        for(j=i+1;j<a.length;j++)
          {
            count=1;
            if(a[i]>0 && a[i]==a[j])
              {
                count++;
                a[j]=-1;
              }
          }
         if(count>maxcount)
           {
               maxcount=count;
               maxnum=a[i];
           }
      }
     System.out.println("The Majority Element is:"+maxnum);
}
}

