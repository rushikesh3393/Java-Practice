class Table
{
	
	synchronized void showTable(int x)
	{
		try{
			for(int i=1;i<=10;i++)
			{
			
				System.out.printf("%d X %d =%d \n",i,x,i*x);
				if(i==5)
				{
					wait(60000);
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("The Error is:"+ex);
		}
	}
}

class Two extends Thread
{
	Table tb;
     public void settable(Table tb)
	{
		this.tb=tb;
	}
	public void run()
	{
		tb.showTable(2);
	}
}

class Three extends Thread
{
	Table tb;
    public void settable(Table tb)
	{
		this.tb=tb;
	}
	public void run()
	{
		tb.showTable(3);
	}
}

public class AsynchronizationApp
{
	
    public static void main(String x[])
	{
		Table tb=new Table();
		
		Two tt=new Two();
		tt.settable(tb);
		tt.start();
		
		Three th=new Three();
		th.settable(tb);
		th.start();
	}
}
 
		




























