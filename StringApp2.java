/*String(char[]): this constructor help us to convert primitive character array in to string object.*/

public class StringApp2
{    public static void main(String x[])
    {   
	    char ch[]=new char[]{'a','b','c','d','e','f','g','h','i'};
		
	    String s= new String(ch);
		
	    System.out.println(s);
    }
}
