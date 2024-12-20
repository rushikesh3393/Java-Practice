import java.util.*;

public class CalculateAveragePercentage
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);

    System.out.println("Enter the First Subject mark");
    int sub1=xyz.nextInt();

   
    System.out.println("Enter the second Subject mark");
    int sub2=xyz.nextInt();

    
    System.out.println("Enter the third Subject mark");
    int sub3=xyz.nextInt();
   

    System.out.println("Enter the Fourth Subject mark");
    int sub4=xyz.nextInt();

    
    System.out.println("Enter the Fifth Subject mark");
    int sub5=xyz.nextInt();

    float total=(sub1+sub2+sub3+sub4+sub5);

    Float average=(float)(sub1+sub2+sub3+sub4+sub5)/5;

    Float percentage=(total/500)*100;
   

    System.out.printf("The average and percentage of student is:%.2f  %.2f",average,percentage);
   }
}