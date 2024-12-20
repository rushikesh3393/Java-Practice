public class SwappingUsingCommandLine
{
  public static void main(String x[])
   {
     
      int a=Integer.parseInt(x[0]);
      int b=Integer.parseInt(x[1]);

      int temp=a;
            a=b;
            b=temp;

      System.out.printf("The values of A=%d\n b=%d",a,b);
   }
}

      