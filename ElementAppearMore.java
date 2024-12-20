import java.util.*;
public class ElementAppearMore
 {
    public static void main(String x[]) 
    {
        int a[] = new int[8];
        int i, j,count=1;

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("The Given Array is:");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t", a[i]);
        }

        for(i=0;i<a.length;i++)
         { count=1;
         for(j=0;j<a.length;j++)
          {
            if(a[i]==a[j])
              {
                count++;
              }
          }
          if(count>a.length/2)
           {
             System.out.println("\nThe element occurs more then n/2 times is:"+a[i]);
               break;
           }
        }
   }
}

            
