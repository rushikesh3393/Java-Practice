import java.util.*;
public class FindPowerOfGivenNumber
{
 public static void main(String x[])
 {
   int power=1,base,index,i;

   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the base");
   base=xyz.nextInt();

   System.out.println("Enter the index");
   index=xyz.nextInt();

   for(i=0;i<index;i++)
   {
     power=power*base;
   }

   System.out.printf("The power is:%d",power);
  }
}