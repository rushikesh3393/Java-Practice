class VoterException extends NullPointerException
{
	public String getErrorMsg()
	{
		return "You are Not Eligible For Voting";
	}
}

class VoterChecker
{
	void voterAgeChecker(int age)
	{
		if(age<18)
		{
			VoterException ve=new VoterException();
			throw ve;
		}
		
		else
		{
			System.out.println("You are Valid Voter");
		}
	}
}

public class VoterApplicationExp
{
	public static void main(String x[])
	{
		try
		{
			VoterChecker ve=new VoterChecker();
			ve.voterAgeChecker(14);
		}
		catch(VoterException ve)
		{
			System.out.println(ve.getErrorMsg());
		}
	}
}

