import java.util.*;
class ArrOp
{
  int a[];
  ArrOp(int a[])
  {
    this.a=a;
  }
  void FindSecSmall(int k)
  {
    int max=a[0];

	
    for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	  {
	    if(a[i]>a[j])
		{
		  max=a[i];
		  k=a[j];
		}
	  }
	}
	System.out.printf("The Second Smallest Element is:%d",k);
  }
}

public class FindSecondSmall
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	
	int a[5]=new int[];
	
	Ststem.out.printf("Enter the Array Element:");
	for(int i=0;i<a.length;i++)
	{
	  a[i]=xyz.nextInt();
	}
	
	ArrOp ap=new ArrOp(a);
	ap.FindSecSmall();
  }
}
  