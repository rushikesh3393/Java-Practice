/* WAP to Create Voter class with id, name and age and create three threads name as WardA,WardB and WardC 
and create 5 voter objects and store data in it and share these five voters in WardA,WardB and WardC 
thread and when we print word details just print with ward name 
Ward A  Ram   1  20
Ward A  Shyam 2  22 */

class Voter
{
	synchronized void show Voter(char ch)
	{
		try{
			for(int i=0;i<=5;i++)
			{
				System.out.printf(" ward %c %c %d %d",wardname,name,id,age);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
			{
				System.out.prinln("Error is",+ex);
			}
	}
}
		
			
