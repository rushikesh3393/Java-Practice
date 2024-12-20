class A extends java.lang.Object
{ int no;
   A(int x)
   {  no=x;
   }
   public boolean equals(Object obj)
   {  A a3 =(A)obj;
	  if(this.no==a3.no)
	  {  return true;
	  }
	  else{
		  return false;
	  }
   }
   public int hashCode(){
	     return no*10000;
   }
}
public class AAPP
{  public static void main(String x[])
   {   A a1 = new A(100);
	   A a2 = new A(100);	
  System.out.println("Hashcode of a1  "+System.identityHashCode(a1));
  System.out.println("Hashcode of a2  "+System.identityHashCode(a2));  
	   if(a1.equals(a2))
	   {   System.out.println("a1 and a2 both are equals");
           System.out.println("User define hashcode of a1 "+a1.hashCode());
		   System.out.println("User defined hashcode of a2 "+a2.hashCode());
	   }
	   else
	   { System.out.println("a1 and a2 not equal");
           System.out.println("User define hashcode of a1 "+a1.hashCode());
		   System.out.println("User defined hashcode of a2 "+a2.hashCode());
	   }
   }
}
