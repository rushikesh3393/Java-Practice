/* Q3. Write program to create class name as CheckChar with two functions 
 void setChar(char ch): this function accept single character as input 
 boolean checkChar()  :   this function can check character is alphabet or digit or special symbol if 
 character is alphabet return true if character is digit then return false.
  */
  
import java.util.*;
class CheckChar
{
  char ch;
  
  void setChar(char ch)
  {
    this.ch=ch;
  }
  
  boolean checkChar()
  {
	  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	  {
         return true;
	  }
      else
	  {
         return false;
	  }
  }
}

public class CheckChar113
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     System.out.printf("Enter the Character");
     char ch=xyz.nextLine().charAt(0);
	 
	 CheckChar cc=new CheckChar();
	 
	 cc.setChar(ch);
	 
	 boolean result=cc.checkChar();
	 
	 if(result==true)
	 {
		 System.out.printf("%c is Character",ch);
	 }
	 else
	 {
		 System.out.printf("%c is NOT Character",ch);
	 }
  }
}
	 