/* Wap in java to create user define class ABC and XYZ  and extends to Thread class 
and print to class ABC as a even number and XYZ  as a Odd num.                     
Using   Run Time Polymorphism Or Loose Coupling in java …?
Note: - With out using start() Method  and join() Method  */

class A extends Thread
{
	
	public void run()
	{
		
		try {
			
			for (int i = 1; i <=100; i++) {
				
				
				if(i%2==0)
				{
					System.out.println(i);
				}
				
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
			System.out.println("Error : "+e);
		}
	}
	
}
class B extends Thread
{
	public void run()
	{
		
		try {
			
			for (int i = 1; i <=100; i++) {
				
				
				if(i%2!=0)
				{
					System.out.println(i);
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
			System.out.println("Error : "+e);
		}
	}
}
class User {
	void display(Runnable r){
		r.run();
	}
}
public class OddEvenThread2 {

	public static void main(String[] args) {
		
		User u=new User();
		u.display(new A());
		u.display(new B());	
	}
}
