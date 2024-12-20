import java.util.*;
public class WashingMachine
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the weight(Grams)");
    int wt=xyz.nextInt();


    if(wt==0)
      {
        System.out.println("Time Estimated:0 Minutes");
      }

    if(wt<2000)
      {
        System.out.println("Time Estimated :25 Minutes");
      }

    if(wt<4000 && wt >=2001)
      {
        System.out.println("Time Estimated :35 Minutes");
      }

    if(wt=<7000 && wt>4000)
      {
        System.out.println("Time Estimated :45 Minutes");
      }

    if(wt>7000)
      {
        System.out.println("OVERLOADED");
      }

    
   }
}
