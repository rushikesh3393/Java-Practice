/*  Q1. Write a program to create class name as Cube with two methods 
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate cube of number and return it
 */
 
 import java.util.*;
 class Cube
 {
   int a;
   void setValue(int x)
   {
	   a=x;
   }
   
   int getCube()
   {
	   return a*a*a;
   }
 }
 
 
 public class CubeCalculation111
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 System.out.printf("Enter the Number");
		 int num=xyz.nextInt();
		 
		 Cube ce=new Cube();
		 ce.setValue(num);
		 
		 int result=ce.getCube();
		 System.out.printf("The Cube of %d is:%d",num,result);
	 }
 }