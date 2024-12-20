import java.util.*;
public class LcmPractice
{
  public static void main(String x[])
  {
	  Scanner xyz=new Scanner(System.in);
	  
	  System.out.printf("Enter the First Number:");
	  int num1=xyz.nextInt();
	  
	  System.out.printf("Enter the Second number");
	  int num2=xyz.nextInt();
	  
	  int hcf=1,lcm=1;
	
	  for(int i=2;i<=num1;i++)
	  {
		  if(num1%i==0 && num2%i==0)
		  {
			  hcf=i;
		  }
	  }
	  
	  int p=num1/hcf;
	  int q=num2/hcf;
	  
	  lcm=p*q*hcf;
	  
	  System.out.println("The LCM is"+lcm);
  }
}