/* Suppose you have a Piggie Bank with an initial amount of $50 and you have to add
some more amount to it. Create a class 'AddAmount' with a data member named
'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank 2 - having a
parameter which is the amount that will be added to Piggie Bank Create object of the
'AddAmount' class and display the final amount in Piggie Bank.*/

class AddAmount
{
  private int amount=50;
  
  AddAmount()
  {
    System.out.printf("The Current Amount In your Piggie Bank is %d",amount);
  }
  
  AddAmount(int adamt)
  {
    int ad=adamt;
	System.out.printf("The Amount After Addition of Money is:%d",amount+ad);
  }
} 

public class PiggieBankAmount
{
  public static void main(String x[])
   {
     AddAmount ad=new AddAmount();
	 AddAmount ad1=new AddAmount(40);
   }
}