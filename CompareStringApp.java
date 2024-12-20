import java.util.*;
class CompareString
{
  char ch[],dh[];
  
  void setCharArray(char c[],char d[])
   {
     ch=c;
     dh=d;
   }

  boolean compare()
   {
     for(int i=0;i<ch.length;i++)
       {
          if(ch[i]!=dh[i])
             {
                return false;
             }
        }
      return true;
    }
}

public class CompareStringApp
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter char Size");
     int size=xyz.nextInt();
     xyz.nextLine();
     

     char a[]=new char[size];
     char b[]=new char[size];
     
     CompareString cs=new CompareString();

     
     System.out.println("Enter the Elements of First String");
     for(int i=0;i<a.length;i++)
        {
          a[i] = xyz.nextLine().charAt(0);
        }

     System.out.println("Enter the Elements of Second String");
     for(int i=0;i<b.length;i++)
        {
           b[i] = xyz.nextLine().charAt(0);
        }
     
     cs.setCharArray(a,b);
     boolean g=cs.compare();
               
      if(g==true)
     {
       System.out.printf("The both Strings Are Same");
      }
      
     else
      {
        System.out.printf("The Both Strings are NOT same");
      }
   }
}