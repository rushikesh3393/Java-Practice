import java.util.*;
public class CheckEqualOrNot
{
  public static void main(String x[])
   {
     int a[]=new int[6];
     int b[]=new int[6];

     int i;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Elements of first array");
     
     for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }

     System.out.println("Elements of array Are");
     
     for(i=0;i<a.length;i++)
     {
       System.out.println(+a[i]);
     }


     System.out.println("Enter Elements of Second array");
     
     for(i=0;i<b.length;i++)
     {
       b[i]=xyz.nextInt();
     }

     System.out.println("Elements of array Are");
     
     for(i=0;i<b.length;i++)
     {
       System.out.println(+b[i]);
     }
      
     int flag=0;
     for(i=0;i<a.length;i++)
      {
         if(a[i]!=b[i])
         {
           
           flag=1;
            break;
         }
        
      }
     
     if(flag==0)
      {System.out.println("yes");}

     else{System.out.println("No");}
           
   }
}
