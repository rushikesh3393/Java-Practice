import java.util.Scanner;
public class NumberOfInversion 
{
    public static void main(String x[]) 
     {
        int a[] = new int[8];
        int i, j,count=0;

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
 
        for(i=0;i<a.length;i++)
         {
         for(j=i+1;j<a.length;j++)
           {
             if(a[i]>a[j])
              {
                count++;
                System.out.printf("\n(%d,%d)",a[i],a[j]);
              }
           }
         }
         System.out.println("Number of Inversions are:"+count);
      }
}