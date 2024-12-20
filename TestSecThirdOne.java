import java.util.*;

class Customer 
{
    private String name;
    private String email;
    private int contact;
    private int bankaccno;

    public void setName(String name) 
	{
        this.name = name;
    }

    public String getName() 
	{
        return name;
    }

    public void setEmail(String email) 
	{
        this.email = email;
    }

    public String getEmail() 
	{
        return email;
    }

    public void setContact(int contact) 
	{
        this.contact = contact;
    }

    public int getContact() 
	{
        return contact;
    }

    public void setBankAccNo(int bankaccno) 
	{
        this.bankaccno = bankaccno;
    }

    public int getBankAccNo() 
	{
        return bankaccno;
    }
}

class Bank 
{
    Customer[] cc;

    void setCustomers(Customer... c) 
	{ 
        cc = c;
    }

    void showDetail()
	{
        for(int i = 0; i < cc.length; i++) 
		{
            System.out.printf("\nThe Name:%s \t Email:%s \t Contact:%d \tBankAccountNumber:%d", cc[i].getName(), cc[i].getEmail(), cc[i].getContact(), cc[i].getBankAccNo());
        }
    }

    Customer searchCustomer(int bankaccno)
	{
        for(Customer c : cc)
			{
              if(c.getBankAccNo() == bankaccno) 
			  {
                return c;
            }
        }
        return null; 
    }
}

public class TestSecThirdOne 
{
    public static void main(String[] args) 
	{
        Scanner xyz = new Scanner(System.in);

        Customer[] c = new Customer[3];
        for(int i = 0; i < c.length; i++) 
		{
            c[i] = new Customer(); 

            System.out.printf("\nEnter the Name, Email, Contact, BankAccountNo:");
            String name = xyz.nextLine();
            String email = xyz.nextLine();
            int contact = xyz.nextInt();
            int bankaccno = xyz.nextInt();

            c[i].setName(name); 
            c[i].setEmail(email);
            c[i].setContact(contact);
            c[i].setBankAccNo(bankaccno);

            xyz.nextLine(); 
        }

        Bank b = new Bank(); 
        b.setCustomers(c); 
        b.showDetail();

        System.out.printf("Enter the Bank Account number:");
        int bac = xyz.nextInt();

        Customer dd = b.searchCustomer(bac); 

        if(dd != null) 
		{
            System.out.printf("\nName:%s \t Email:%s \t Contact:%d", dd.getName(), dd.getEmail(), dd.getContact());
        } 
		else 
		{
            System.out.println("No customer found ");
        }
    }
}
