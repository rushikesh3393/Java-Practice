/* Write Program create class name as ArrSum with method 
void setValue(int arr[]) you have to create child class name as GetSum with method int getArrSum() you have to accept array values from ArrSum 
and calculate its sum and return it
 */
 
import java.util.*;
class ArrSum
{
  int arr[];
  int sum=0;
  
  void setValue(int arr[])
  {
	  this.arr=arr;
  }
}

class GetSum extends ArrSum
{
   int getArrSum()
   {
	   for(int i=0;i<arr.length;i++)
	   {
		   sum=sum+arr[i];
	   }
	   return sum;
   }
}
 
 public class Arrsum1115
 {
	 
    public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		System.out.printf("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=xyz.nextInt();
		}
		
	    GetSum gs=new GetSum();
		gs.setValue(arr);
		
		int result=gs.getArrSum();
		
		System.out.printf("The Sum of array Elements is:%d",result);
	}
 }