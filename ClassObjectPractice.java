/* WAP to create class name as ConvertToUpper  with two functions 
void setCharArray(char[]): this function accept character array as input 
void toConvert(): this function is used for convert your character array from lower case to upper case 
 */
 
 import java.util.*;
 class ConvertToUpper
 {
	 char m[];
	 void setCharArray(char a[])
	 {
		m=a; 
	 }
	 
	 void toConvert()
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 m[i]=(char)((int)m[i]-32);
		 }
	 }
	 
	 void showArray()
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 System.out.printf("%c \t",m[i]);
		 }
	 }
 }
 
 public class ClassObjectPractice
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 char ch[]=new char[5];
		 System.out.printf("Enter char Array");
		 for(int i=0;i<ch.length;i++)
		 {
			 ch[i]=xyz.nextLine().charAt(0);
		 }
		 
		 ConvertToUpper c=new ConvertToUpper();
		 
		 c.setCharArray(ch);
		 
		 System.out.printf("char Array before Conversion");
		 c.showArray();
		 
		 c.toConvert();
		 System.out.printf("char Array After Conversion");
		 c.showArray();
	 }
 }
		 
		 
		 
		 
		 