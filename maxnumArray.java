import java.util.*;
public class maxnumArray
{
  public static void main(String x[])
   {
     int a[]=new int[8];
     int i,j,count=1,k=0,maxcount=0;

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

     for(i=0;i<a.length;i++)
     {
       if(a[i]!=0)
       {  
          count=1;
          for(j=i+1;j<a.length;j++)
           {
              if(a[i]==a[j])
             {
               count++;
               a[j]=0;
             }
             if(count>maxcount)
             {
               maxcount=count;
               k=a[i];
             }
          }
        }
     }
      System.out.printf("The maximum repeating number is:%d",k);
    }
}