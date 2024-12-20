class A extends Thread
{
   public void run()
   {
     try{
	for(int i=1; i<=5; i++)
	{ System.out.println("First Thread is "+i);
	  Thread.sleep(1000);
	}
     }
     catch(Exception ex)
     { System.out.println("Error is "+ex);
     }
   }
}
class B extends Thread
{   public void run()
   {
     try{
	for(int i=1; i<=5; i++)
	{ System.out.println("Second Thread is "+i);
	  Thread.sleep(1000);
	}
     }
     catch(Exception ex)
     { System.out.println("Error is "+ex);
     }
   }

}
class C extends Thread
{  public void run()
   {
     try{
	for(int i=1; i<=5; i++)
	{ System.out.println("Third Thread is "+i);
	  Thread.sleep(1000);
	}
     }
     catch(Exception ex)
     { System.out.println("Error is "+ex);
     }
   }

}
public class ThreadPriorityApp
{
   public static void main(String x[])
   {
	A a1 = new A();
	a1.setPriority(Thread.NORM_PRIORITY);
    a1.start();
		
    B b1 = new B(); 
    b1.setPriority(Thread.MIN_PRIORITY);
	b1.start();

	C c1 = new C();
	c1.setPriority(Thread.MAX_PRIORITY);
	c1.start();
   }
}
