/*Write a program in JAVA to find create character array with size 10 and extract digit from character array and find its sum 
Example: abc124mno5
Output: 1+2+4+5= 12*/

import java.util.*;
public class TestSecondSecond
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
	 
	
	 
	 char a[]=new char[9];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=xyz.nextLine().charAt(0);
	 }
	 
	 int sum=0;
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]>='0' && a[i]<='9')
		 {
			 sum=sum+a[i];
		 }
	 }
	 
	 System.out.printf("THe Sum is %d",sum);
  }
}
