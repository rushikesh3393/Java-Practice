public class PatternoneAsg
{
  public static void main(String x[])
   {
      for(int i=1;i<=6;i++)
	     {
		  for(int j=1;j<=11;j++)
		    {
			  if(j=7-i || j=5+i)
			   {
			     System.out.printf("*");
				 
			   }
			   else
			   {
				  System.out.printf(""); 
			   }
            }
          }
    }
}	