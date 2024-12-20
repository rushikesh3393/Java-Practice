import java.util.Scanner;
public class MaxDifferenceLargerAfter 
{
    public static void main(String x[]) 
     {
        int a[] = new int[8];
        int i, j,k=0,l=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }

        System.out.println("The Given Array is:");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t", a[i]);
        }
           
        int maxdiff=0;
        for(i=0;i<a.length-1;i++)
          {
             int diff=a[i+1]-a[i];
           
             if(diff>maxdiff && a[i+1]>a[i])
              {
                k=i;
                l=i+1;
                maxdiff=diff;
              }
          }
         System.out.printf("\nThe elements which provide maximum difference is:%d %d",k,l);
         System.out.printf("\nThe Maximum difference between two elements in the array is:%d",maxdiff);
    }
}