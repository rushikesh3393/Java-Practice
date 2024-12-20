/* WAP to create Vector and store 10 integer values in it and find the duplicated values from Vector */
import java.util.*;
public class DupicateValueVector
{
	 public static void main(String x[])
	 {
		Vector v=new Vector();

           v.add(10);
		   v.add(40);
		   v.add(30);
		   v.add(60);
		   v.add(10);
		   v.add(30);
		   v.add(10);
		   v.add(30);
		   v.add(40);
		   v.add(10);
		   
		   int duplicate=0;
		   
		   System.out.printf("The Duplicate values are");
		   for(int i=0;i<v.size();i++)
		   {
			   for(int j=i+1;j<v.size();j++)
			   {
				   if(v.get(i)==v.get(j))
				   {
					   duplicate=(int)v.get(i);
					   v.set(j,0);
				   }
				   
			   }
			   if(duplicate!=0)
			   System.out.println(+duplicate);
		   }
	 }
}
		   