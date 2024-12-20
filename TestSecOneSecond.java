/* WAP to print the following series?
0 1 1 2 3 5 8 13 21 34 
 */
 
 import java.util.*;
 public class TestSecOneSecond
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.printf("Enter the Value of N");           
		 int n=xyz.nextInt();                            //10
		 
		 int num1=0;
		 int num2=1;
		 
		 
		 for(int i=0;i<n;i++)
		 {
			 int sum=num1+num2;
			 System.out.printf("%d \t",num1);                 //0
			 
			 int temp=num1;                                  
			 num1=num2;                                      //1
			 num2=sum;                                       //1
		 }
	 }
 }