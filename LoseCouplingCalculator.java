import java.util.*;

abstract class Value
{
  int a,b;
  
  void setValue(int x,int y)
  {
    a=x;
	b=y;
  }
  abstract void PerformCalculation();
  
}

class Addition extends Value
{
	void PerformCalculation()
	{
		int Add=a+b;
		System.out.printf("The Addition is:%d",Add);
	}
}

class Subtraction extends Value
{
	void PerformCalculation()
	{
		int Sub=a-b;
		System.out.printf("The subtraction is:%d",Sub);
	}
}

class Multiplication extends Value
{
	void PerformCalculation()
	{
		int Mul=a*b;
		System.out.printf("The Multiplication is:%d",Mul);
	}
}

class Division extends Value
{
	void PerformCalculation()
	{
		float div=(float)a/b;
		System.out.printf("The Division is:%f",div);
	}
}

class Calculator
{
	void PerformOperation(Value v)
	{
		v.PerformCalculation();
	}
}

public class LoseCouplingCalculator
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.printf("\nEnter the Two Values");
		int num1=xyz.nextInt();
		int num2=xyz.nextInt();
		
		System.out.printf("\n1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
		System.out.printf("\nEnter the Choice");
		int choice=xyz.nextInt();
		
		Calculator c=new Calculator();
		Value v;
		
		switch(choice)
		{
			case 1:{
				       v=new Addition();
					   v.setValue(num1,num2);
					   c.PerformOperation(v);
					   break;
			       }
				   
			case 2:{
				       v=new Subtraction();
					    v.setValue(num1,num2);
					   c.PerformOperation(v);
					   break;
			       }
				   
			case 3:{
				       v=new Multiplication();
					    v.setValue(num1,num2);
					    c.PerformOperation(v);
					   break;
			       }
				   
			case 4:{
				       v=new Division();
					    v.setValue(num1,num2);
					    c.PerformOperation(v);
					   break;
			       }
				   
            default:{
                       System.out.printf("Wrong Choice");
			        }
		}
	}
}	
				   
		    
				      
