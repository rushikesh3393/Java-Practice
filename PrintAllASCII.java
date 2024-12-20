import java.util.*;
public class PrintAllASCII
{
  public static void main(String x[])
  {
    int i;

    for(i=0;i<256;i++)
     {
       System.out.printf("\nThe ASCIII value of %c is %d",i,i);
     }
  }
}
    