public class ArrayIndexOutOfBoundApp
{  
    public static void main(String x[])
    { 
	  try
	   {
	     int a[]=new int[2];
	     a[0]=100;
	     a[1]=200;
	     System.out.println(a[2]);
       }
      catch(ArrayIndexOutOfBoundsException ex)
      {  
	     System.out.println("Error Is:"+ex);
      }
    }
}
