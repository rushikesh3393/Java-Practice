/* Write a program to create the class name as Reverse with a two methods setValue
(int) and boolean checkPerfectNumber()
first method name as setValue(int) can set the number and checkPerfectNumber() to return
true if number is perfect and return false if given number is not perfect*/



class Reverse 
{
    private int number;

    public void setValue(int num) 
	{
        this.number = num;
    }

    public int getValue() 
	{
        return this.number;
    }

    public boolean checkPerfectNumber() 
	{
        if (number <= 1) 
		{ 
            return false;
        }
        
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) 
		{ 
            if (number % i == 0) 
			{
                sum += i;
            }
        }
        
        return sum == number;
    }
}

public class CheckPerfect 
{
    public static void main(String[] args) 
	{
        Reverse reverse = new Reverse();
        reverse.setValue(10); 
        
        if (reverse.checkPerfectNumber()) 
		{
            System.out.println("The number " + reverse.getValue() + " is a perfect number.");
        } 
		else 
		{
            System.out.println("The number " + reverse.getValue() + " is not a perfect number.");
        }
    }
}
