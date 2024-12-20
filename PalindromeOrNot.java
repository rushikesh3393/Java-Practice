import java.util.*;
public class PalindromeOrNot
{
  public static void main(String x[])
  {
     int num,reverse=0,rem=0,temp;
     Scanner xyz=new Scanner(System.in);
    
     System.out.printf("Enter the Number");
     num=xyz.nextInt();

     temp=num;

     while(num!=0)
     {
       rem=num%10;
       reverse=reverse*10+rem;
       num=num/10;
     }

     if(reverse==temp)
     {
       System.out.printf("The %d is Palindrome Number",temp);
     }
     else
     {
       System.out.printf("The %d is NOT Palindrome Number",temp);
     }
   }
}