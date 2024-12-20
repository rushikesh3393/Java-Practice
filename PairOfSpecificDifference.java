import java.util.Scanner;
public class PairOfSpecificDifference 
{
    public static void main(String x[]) 
     {
        int a[] = new int[8];
        int i, j,target,count=0;
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
        
        System.out.println("\n Enter the Target");
        target=xyz.nextInt();

        System.out.printf("\n The distinct pairs for difference %d are:",target);
        for(i=0;i<a.length-1;i++)
         {
           if(a[i]-a[i+1]==target || a[i+1]-a[i]==target)
             {
               count++;
               System.out.printf("\n [%d ,%d]\t",i,i+1);
             }
         }
        System.out.printf("\nThe Total pairs Are:%d",count);
      }
}
          