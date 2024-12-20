/*  Write program to create class name as CheckDuck with parameterized constructor 
 CheckDuck(int no): this constructor can accept number as parameter
 Boolean isDuckNumber(): this function check if number is duck return true otherwise return false.
 */
 import java.util.*;
 class CheckDuck
 {
	 int no;
   CheckDuck(int no)
   {
	   this.no=no;
   }
   
   boolean isDuckNumber()
   {
	   while(no!=0)
	   {
		   if(no%10==0)
		   {
			   return true;	   
		   }
		   no=no/10;
	   }
	   return false;
   }
 }
 
 public class CheckDuck117
 {
   public static void main(String x[])
     {
		 Scanner xyz=new Scanner(System.in);
		 System.out.printf("Enter the Number");
		 
		 int num=xyz.nextInt();
		 int n=num;
		 CheckDuck cd=new CheckDuck(num);
		 
		 boolean result=cd.isDuckNumber();
		 
		 if(result==true)
		 {
			 System.out.printf("%d is Duck Number",n);
		 }
		 else
		 {
			 System.out.printf("%d is NOT Duck Number",n);
		 }
	 }
 }