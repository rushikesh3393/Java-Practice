import java.util.*;
class ExtractDigitAndCalSum 
{
   char ch[];

   void setCharArray(char c[])
    {
      ch=c;
    }

   int getSum()
    {
      int sum=0;
      for(int i=0;i<ch.length;i++)
        {
          if(ch[i]>='0' && ch[i]<='9')
            {
              sum=sum+(ch[i]-'0');
            }
        }
       return sum;
    }
}

public class ExtractDigitCalSumApp
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the String size");
      int size=xyz.nextInt();
      xyz.nextLine();
      
      ExtractDigitAndCalSum cs=new ExtractDigitAndCalSum();

      char a[]=new char[size];
      System.out.println("Enter the Array Elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=xyz.nextLine().charAt(0);
        }
       
      cs.setCharArray(a);
      int sum=cs.getSum();

       System.out.println("The Sum of Extracted digit from String is:"+sum);
    }
}
      

