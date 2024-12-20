import java.util.*;
class SortCharArray
{
  char ch[];

  void setCharArray(char c[])
    {
      ch=c;
    }

  void sort()
    {
      for(int i=0;i<ch.length;i++)
       {
         for(int j=i+1;j<ch.length;j++)
         {
          if(ch[i]>ch[j])
           {
              char temp=ch[i];
                   ch[i]=ch[j];
                   ch[j]=temp;
           }
          }
        }
        System.out.println("The Sorted Array is:");
          for(int i=0;i<ch.length;i++)
             {
                System.out.printf("%c \t",ch[i]);
             }
      }
}

public class SortString
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter the size");
     int size=xyz.nextInt();
     xyz.nextLine();

     SortCharArray ca=new SortCharArray();
     char a[]=new char[size];

     System.out.println("Enter the String Elements");
     for(int i=0;i<a.length;i++)
       {
         a[i]=xyz.nextLine().charAt(0);
       }

    ca.setCharArray(a);
    ca.sort();
   }
}