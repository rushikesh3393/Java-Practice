import java.util.*;
class ConvertToUpper
{  char ch[];
   void setCharArray(char c[])
   { ch=c;
   }
   void toConvert()
   {
      for(int i=0;i<ch.length;i++)
      {
	   if(ch[i]>='a' && ch[i]<='z')
	   {    
		ch[i]=(char)((int)ch[i]-32);
	   }
      }
   }
   void show(){
      for(int i=0;i<ch.length;i++)
      { System.out.printf("%c",ch[i]);
      }
   }
}
public class ArrayPractice
{   public static void main(String x[])
    {  Scanner xyz  = new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=xyz.nextInt();
	xyz.nextLine();
	char ch[]=new char[size];
	System.out.println("Enter data in character array");
	for(int i=0; i<ch.length;i++)
	{ ch[i]=xyz.nextLine().charAt(0);
	}
	ConvertToUpper ct = new ConvertToUpper();
	ct.setCharArray(ch);
	System.out.println("Before conversion");
                                      ct.show();
	ct.toConvert();
	System.out.println("\nAfter conversion");
	ct.show();
    }
} 

		
		System.out.printf("Array Elements Are:\n");
		for(int i=0;i<size-count;i++)
		{
			System.out.printf("%d \t",a[i]);
		}
			
		
	}
}