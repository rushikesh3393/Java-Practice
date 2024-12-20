import java.util.Scanner;

class per {

	void calPer(int Sub[]) 
	{
		int total = 0;
        for(int i=0; i<Sub.length; i++) 
		{
            total += Sub[i];
        }
        
        float percentage = (float)total/Sub.length;
        System.out.println("\n Percentage: " + percentage);
    }
}

class CSE extends per 
{
	String name, address, year;
	int id;

	CSE(int id, String name, String address, String year) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.year = year;
	}

	public void showCSEPer() 
	{
		System.out.println("CSE Percentage for " + name);
	}
}

class ETC extends per
{
	private int id;
	private String name, address, year;

	ETC(int id, String name, String address, String year) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.year = year;
	}
	
	public void showETCPer() 
	{
		System.out.println("ETC Percentage for " + name);
	}
}

public class EnggResultApp 
{
	public static void main(String[] args) 
	{
		
		int[] marksCse = new int[6];
		int[] marksEtc = new int[6];
		
		Scanner xyz = new Scanner(System.in);
		System.out.printf("Enter the Marks For Cse Student");
		for (int i = 0; i < 6; i++) 
		{
			System.out.println("Enter " + (i+1) + " Subject of marks: ");
			marksCse[i] = xyz.nextInt();
		}
		
		System.out.printf("Enter the Marks For Etc Student");
		for (int i = 0; i < 6; i++) 
		{
			System.out.println("Enter " + (i+1) + " Subject of marks: ");
			marksEtc[i] = xyz.nextInt();
		}
		
		CSE cse = new CSE(1, "Ram", "Sangli", "2023");
	    cse.calPer(marksCse);
	    cse.showCSEPer();
	    
	
	    ETC etc = new ETC(2, "Shayam", "Kolhapur", "2023");
	    etc.calPer(marksEtc);
	    etc.showETCPer();
	}
}