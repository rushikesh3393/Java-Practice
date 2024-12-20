class VoterException extends ArithmeticException
{
	public String ErrorMessage()
	{
		return "Age not valid";
	}
}

class Voting 
{
	
	void AcceptDeatil( int age,String Name)
	{
		
		if(age<18)
		{
			VoterException ve=new VoterException();
			throw ve;
		}
		
		else
		{
			System.out.printf("The Name And age Is %s ,%d:",Name,age);
		}
	}
}

public class UserDefinedException
{
	
   public static void main(String x[])
    {
	  try
	  {
	   Voting vr =new Voting();
	   vr.AcceptDeatil(17,"Ram");
	  }
	  catch(VoterException ve)
	  {
		  System.out.println("Error is"+ve.ErrorMessage());
	  }
	}
}

		   