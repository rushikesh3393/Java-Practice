import java.util.*;
public class PrimeChecking
{
	public static void main(String x[])
	{
		int num,i,count=0;

        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter the Number");
         num=xyz.nextInt();

        for(i=1;i<=num;i++)
         {
          if(num%i==0)
           {
             count++;
           }
         }

  if(count==2)
   {
      System.out.printf("%d is Prime Number",num);
   }

  else
   {
     System.out.printf("%d is NOT Prime Number",num);
   }
		
	}
}
			
		