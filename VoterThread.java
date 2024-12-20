/* WAP to Create Voter class with id, name and age and create three threads name as WardA,WardB and WardC
 and create 5 voter objects and store data in it and share these five voters in WardA,WardB and WardC 
 thread and when we print word details just print with ward name 
Ward A  Ram   1  20
Ward A  Shyam 2  22
 */
 
 class Voter
 {
	 int id;
	 String name;
	 int age;
	 
		 
	synchronized void showWardDetail(String wardname)
	{
     try
	  {     
	       {
			   System.out.printf("The Ward Name is:%s \nThe name is:%s \t The Id is:%d \t The Age is:%d \t\n",wardname,name,id,age);
		   }
		   Thread.sleep(5000);
	  }
	 catch(Exception ex)
	 {
		 System.out.println("Error is"+ex);
	 }
	}	 
	 
 }
 
 
 class WardA extends Thread
 {
	 Voter v;
	 
	 void setWardDetail(Voter v)
	 {
		 this.v=v;
	 }
	 public void run()
	 {
		 v.showWardDetail("WardA");
	 }
	 
 }
 
 
 class WardB extends Thread
 {
	 Voter v;
	 
	 void setWardDetail(Voter v)
	 {
		 this.v=v;
	 }
	 public void run()
	 {
		 v.showWardDetail("WardB");
	 }
 }
 
 class WardC extends Thread
 {
	 Voter v;
	 
	 void setWardDetail(Voter v)
	 {
		 this.v=v;
	 }
	 public void run()
	 {
		 v.showWardDetail("WardC");
	 }
 }
 
 public class VoterThread
 {
	 public static void main(String x[])throws Exception
	 {
		  Voter vv1 = new Voter();
        vv1.id = 1;
        vv1.name = "Ram";
        vv1.age = 20;

        Voter vv2 = new Voter();
        vv2.id = 2;
        vv2.name = "Shyam";
        vv2.age = 22;

        Voter vv3 = new Voter();
        vv3.id = 3;
        vv3.name = "John";
        vv3.age = 25;

        Voter vv4 = new Voter();
        vv4.id = 4;
        vv4.name = "Alice";
        vv4.age = 28;

        Voter vv5 = new Voter();
        vv5.id = 5;
        vv5.name = "Bob";
        vv5.age = 30;

        WardA a = new WardA();
        a.setWardDetail(vv1);
        a.start();

        WardB b = new WardB();
        b.setWardDetail(vv2);
        b.start();

        WardC c = new WardC();
        c.setWardDetail(vv3);
        c.start();

        WardA d = new WardA();
        d.setWardDetail(vv4);
        d.start();

        WardB e = new WardB();
        e.setWardDetail(vv5);
        e.start();
	 }
 }
		 
		 
		 