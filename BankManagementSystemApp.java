/* Write a program to implement the Dynamic Polymorphism by using interface
Create interface Bank with methods :-
void deposit(double amount),void withdraw(double amount),double getBalance();
also create class SavingsBank and class CurrentBank and implements interface
Bank and override methods and write logic. Create adopter class BankOperations
With methods:-
 public BankAdapter(Bank bank) ,public void performDeposit(double amount) ,
 public void performWithdraw(double amount) ,public double checkBalance()
Create driver class BankManagementSystemApp with main() method. */

import java.util.*;

interface Bank
{
	void deposit(double amount)
	{
	}
	
	void withdraw(double amount)
	{
	}
	
	double getBalance()
	{
	}
}
class BankOperations implements Bank
{
	public BankAdapter(Bank bank)
	{
	}
	public void performDeposit(double amount)
	{
	}
	public void performWithdraw(double amount)
	{
	}
	public double checkBalance()
	{
	}
	
	
	
	
}


class SavingBank implements Bank
{
}

class CurrentBank implements Bank
{
}


























public class BankManagementSystemApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		