import java.util.*;
public class PrintItInWords
{
  public static void main(String x[])
  {
    int num,reverse=0,rem;
    Scanner xyz=new Scanner(System.in);

    System.out.println("Enter the Number");
    num=xyz.nextInt();

    
     while(num != 0)
    {
       rem=num%10;
       reverse=reverse*10+rem;
       num=num/10;
    }

   while(reverse!=0)
   {
    switch(reverse%10)
    {
     case 0: {
                System.out.print("Zero ");
                break;
             }

     case 1: {
                System.out.print("One ");
                break;
             }

     case 2: {
                System.out.print("Two ");
                break;
             }

     case 3: {
                System.out.print("Three ");
                break;
             }

     case 4: {
                System.out.print("Four ");
                break;
             }

     case 5: {
                System.out.print("Five ");
                break;
             }

     case 6: {
                System.out.print("Six ");
                break;
             }

     case 7: {
                System.out.print("Seven ");
                break;
             }

     case 8: {
                System.out.print("Eight ");
                break;
             }

     case 9: {
                System.out.print("Nine ");
                break;
             }
        }
        
        reverse = reverse / 10;
    }
    }
}
