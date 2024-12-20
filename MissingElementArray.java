import java.util.*;

public class MissingElementArray
   {
     public static void main(String x[])
       {

         int a[]=new int[5];
         int i,k=0;

         Scanner sc=new Scanner(System.in); 
         System.out.println("Enter Element of Array:");

         for(i=0;i<a.length;i++) 
            {
             a[i]=sc.nextInt();
            }

        System.out.println("The smallest missing Elements is:"); 
          for(i=0;i<a.length;i++)
           {
             k=a[i]+1;
             if(k>a[i]&& k<a[i+1])
               {
                 System.out.println(+k);
                 break;
               }
           }
        }
    }