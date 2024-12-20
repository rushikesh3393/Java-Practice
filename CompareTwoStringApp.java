/* Write a JAVA program to compare two strings */

public class CompareTwoStringApp
{ public static void main(String x[])
  {   
     String s="abc";
	 String s1="abcd";
	 
	 int result=s.compareTo(s1);
	 
	if(result == 0)
	{  
       System.out.println("Strings are equal");
	}
	else
	{  
      System.out.println("Strings are not equal");
	}
  }
}
