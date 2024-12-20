import java.util.*;
public class Monkey
{
  public static void main(String x[])
  {
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter Number of Monkeys");
   int n=xyz.nextInt();

   System.out.println("Enter Number of eatable Bananas by Single Monkey");
   int k=xyz.nextInt();

   System.out.println("Enter Number of eatable Peanuts by single Monkey");
   int j=xyz.nextInt();

   System.out.println("Total number of Bananas");
   int m=xyz.nextInt();

   System.out.println("Total number of Peanutes");
   int p=xyz.nextInt();


   int remain=n-(m/k)-(p/j);
 
   System.out.println("Number of remaining Monkeys on the tree Are:"+remain);
  }
}