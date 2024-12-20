import java.util.*;
public class CeilingInSortedArray 
{
    public static void main(String x[]) 
      {
        int a[] = new int[6];
        int i,ceil;

        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter the Elements in array");
        for (i = 0; i < a.length; i++) 
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("Elements of array Are");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t",a[i]);
        }

        System.out.println("\nEnter the Number");
        ceil=xyz.nextInt();

        for(i=0;i<a.length;i++)
          {
           if(a[i]>ceil)
            {
              System.out.printf("The Ceiling of %d is %d",ceil,a[i]);
              break;
            }
          }
       }
}
            