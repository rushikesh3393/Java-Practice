/* Wap in java to create user define class Test1 and Test2  and extends to Thread class and
 print to class Test1 as a even number and Test2 as a Odd num.
Using Tight Coupling in java ..?  */

class Test1 extends Thread
{
   public void run()
   {
	   try{
		   
	       System.out.println("Even Numbers Are:");
	       for(int i=0;i<=10;i++)
	        {
		      if(i%2==0)
		      {
			   System.out.println(i);
			   Thread.sleep(1000);
			    
		      }
	        }
	   }
	   catch(Exception ex)
	   {
		   System.out.println(ex);
	   }
   }
   
}

class Test2 extends Thread
{
	   public void run()
   {
	   System.out.println("Odd Numbers Are:");
	   for(int i=0;i<=10;i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.println(i);
			      
		   }
	   }
   }
}

public class OddEvenThread
{
	public static void main(String x[])
	{
		Test1 t=new Test1();
		Test2 tt=new Test2();
		t.start();
	    tt.start();
	}
}
