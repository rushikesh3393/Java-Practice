public class CheckPrimeNumber
{
   public static void main(String x[])
{
  int num=Integer.parseInt(x[0]);
 
  int count=0;

  for(int i=1;i<=num;i++)
   {
     if(num%i==0)
       {
         count++;
       }
   }

  if(count==2)
   {  
    System.out.printf("Number is Prime");
   }
 
  else
   {
    System.out.printf("Not prime");
   }
}
}
  
