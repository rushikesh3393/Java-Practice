class Showing 
{
    synchronized void showNum(int x)
	{
        try 
		{
            for (int i = 1; i <= x; i++) 
			{
                System.out.printf(" First Thread %d \n", i);
                Thread.sleep(1000);
            }
        } 
		catch (Exception ex) 
		{
            System.out.println("Error is " + ex);
        }
    }

    synchronized void showChar(char ch) 
	{
        try 
		{
            for (char c = 'a'; c <= ch; c++) 
			{
                System.out.printf(" Second Thread %c \t", c);
                Thread.sleep(1000);
            }
        } 
		catch (Exception ex) 
		{
            System.out.println("Error is " + ex);
        }
    }
}

class Number extends Thread 
{
    Showing showing;

    public Number(Showing showing)
	{
        this.showing = showing;
    }

    public void run() 
	{
        showing.showNum(10);
    }
}

class Alphabet extends Thread 
{
    Showing showing;

    public Alphabet(Showing showing) 
	{
        this.showing = showing;
    }

    public void run() 
	{
        showing.showChar('z');
    }
}

public class TesttSecThreeThird 
{
    public static void main(String[] args)
	{
        Showing showing = new Showing();

        Number n = new Number(showing);
        Alphabet a = new Alphabet(showing);

        n.start();
        a.start();
    }
}
