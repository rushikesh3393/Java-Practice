/*Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate cube of number and return it.*/

import java.util.*;
class Cube
{
  int a;
  void setValue(int y)
   {
      a=y;
   }

  int getCube()
   {
     return a*a*a;
   }
}

public class FindCubePas1
{
 public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    Cube c1=new Cube();

    System.out.printf("Enter the Value");
    int v=xyz.nextInt();

    c1.setValue(v);
    int result=c1.getCube();
     
    System.out.printf("The Cube of %d is %d",v,result);
   }
}