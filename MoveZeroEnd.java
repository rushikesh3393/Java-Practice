import java.util.Scanner;
public class MoveZeroEnd 
{
    public static void main(String x[]) 
     {
        int a[] = new int[8];
        int i, j;

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
             if(a[j]!=0)
             {
               int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
            }
          }
       
        System.out.println("\nThe Final Array is:");
        for (i = 0; i < a.length; i++) 
        {
            System.out.printf("%d \t", a[i]);
        }
}
}