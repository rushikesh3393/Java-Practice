import java.util.*;
public class PrintPerfectNumber
{
  public static void main(String x[])
   {
     int n,sum=0,i,j;

     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the value of n");
     n=xyz.nextInt();

     System.out.printf("The Perfect Numbers from 1 to %d are:",n);

     for(i=1;i<=n;i++)
     {
       sum=0;
       for(j=1;j<i;j++)
        {
          
          if(i%j==0)
            {
              sum=sum+j;
            }
        }
    
      if(i==sum)
        {
          System.out.printf("%d\t",i);
        }
     }
   }
}
















