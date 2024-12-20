import java.util.*;
public class FindAllFactorsOfNumber
{
 public static void main(String x[])
 {
   int num,i;

   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the Number");
   num=xyz.nextInt();

   System.out.println("The All facors of Given Number are:\n");

   for(i=1;i<num;i++)
   {
     if(num%i==0)
      {
        System.out.printf("%d \t",i);
      }
   }
  }
}