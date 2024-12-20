import java.util.*;

public class Prime
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);

     System.out.printf("Enter the Value of n");
     int n=xyz.nextInt();

     int count=0;

     for(int i=1;i<=n;i++)
       {                                                         
           for(int j=1;j<=i;j++)
            {
               if(i%j==0)
               {
                 count++;
               }
            }
       
     if(count==2)
      {
          System.out.printf("%d",i);
      }
      
      count=0;
    }
   }
}