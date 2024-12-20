import java.util.*;

public class CheckDigitSymbolSpecialChar
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.printf("Enter the Character");

     char a=xyz.nextLine().charAt(0);

     if(a>='0' && a<='9')
        {
          System.out.printf("The %c is Digit",a);
        }

     else if( (a>='a' && a<='z') || (a>='a' && a<='z')|| (a==' ') )
        {
          System.out.printf("The %c is character",a);
        }

     else
       {
         System.out.printf("%c is Special Symbol",a);
       }
    }
}