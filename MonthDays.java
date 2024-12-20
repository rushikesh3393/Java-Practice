import java.util.*;
public class MonthDays
{
   public static void main(String x[])
   {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Month Number");
    int month=xyz.nextInt();

    switch(month)
    {
     case 1:{
              System.out.println("The number of days in this month is 31");
              break;
            }

     case 2:{
              System.out.println("The number of days in this month is 28 or 29");
              break;
            }

     case 3:{
              System.out.println("The number of days in this month is 31");
              break;
            }

     case 4:{
              System.out.println("The number of days in this month is 30");
              break;
            }

     case 5:{
              System.out.println("The number of days in this month is 31");
              break;
            }

     case 6:{
              System.out.println("The number of days in this month is 30");
             break;
            }

     case 7:{
              System.out.println("The number of days in this month is 31");
             break;
            }

     case 8:{
              System.out.println("The number of days in this month is 31");
              break;
            }

     case 9:{
              System.out.println("The number of days in this month is 30");
              break;
            }

     case 10:{
              System.out.println("The number of days in this month is 31");
               break;
            }

     case 11:{
              System.out.println("The number of days in this month is 30");
               break;
            }

     case 12:{
              System.out.println("The number of days in this month is 31");
               break;
            }
        }
     }
}