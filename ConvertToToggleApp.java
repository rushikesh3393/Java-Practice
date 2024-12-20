import java.util.*;

public class ConvertToToggleApp 
{
    public static void main(String x[]) 
	{   
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter string value");
        String s = xyz.nextLine();
        
        String result = myToToggleCase(s);
        System.out.println("Result is " + result);
    }
    
    public static String myToToggleCase(String str) 
	{
        char[] chars = str.toCharArray(); 
        
        for(int i = 0; i < chars.length; i++) 
		{  
            char ch = chars[i];
            
            if(ch >= 65 && ch <= 90) 
			{
                chars[i] = (char)(ch + 32);
            }
           
            else if(ch >= 97 && ch <= 122) 
			{
                chars[i] = (char)(ch - 32);
            }
           
        }
        
        return new String(chars); 
    }
}
