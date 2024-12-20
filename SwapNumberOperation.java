class Swap
{
  int a,b,temp;

  void setValue(int x,int y)
   {
     a=x;
     b=y;
      System.out.printf("\n The value of a is:%d and b is:%d",a,b);
   }

  void swapDigit()
   {
       temp=a;
       a=b;
       b=temp;
       System.out.printf("\nThe value of a is: %d and b is: %d is:",a,b);
   }

  void swapValue()
   {
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.printf("\nThe value of a is: %d and b is: %d is:",a,b);
   }
}

public class SwapNumberOperation
{
  public static void main(String x[])
   {
     Swap sp=new Swap();

     sp.setValue(20,10);
     sp.swapDigit();
     sp.swapValue();
   }
}