import java.util.*;
class Product
{
  private int Id;
  private String Name;
  private int Price;
  private int Quantity;

  public void setid(int i)
    {
      Id=i;
    }
  public int getid()
    {
      return Id;
    }

  public void setname(String n)
    {
      Name=n;
    }
  public String getname()
    {
      return Name;
    }


  public void setprice(int p)
    {
      Price=p;
    }
  public int getprice()
    {
      return Price;
    }


  public void setquantity(int q)
    {
      Quantity=q;
    }
  public int getquantity()
    {
      return Quantity;
    }
}


class Customer
{
  private int ID;
  private String NAME;
  private int CONTACT;

  public void setcid(int ii)
    {
       ID=ii;
    }
  public int getcid()
    {
       return ID;
    }

  public void setcname(String nm)
    {
       NAME=nm;
    }
  public String getcname()
    {
       return NAME;
    }

  public void setccontact(int cc)
    {
       CONTACT=cc;
    }
  public int getccontact()
    {
      return CONTACT;
    }
}


class Bill
{
  Product [] pd;
  Customer cs;

  public void setOrder(Customer c,Product...p)
    {
       cs=c;
       pd=p;
    }

  public void generateInvoice()
    {
       int Grand_total=0;
       System.out.println("Customer Name:"+cs.getcname()+"\tID:"+cs.getcid()+"\tContact:"+cs.getccontact());
      
       System.out.println("\nID\t Product Name\t Quantity\t Price\t Total\n");
       for(int i=0;i<pd.length;i++)
        {
           int total=pd[i].getprice()*pd[i].getquantity();
           Grand_total=Grand_total+total;

           System.out.println(pd[i].getid()+"\t\t"+pd[i].getname()+"\t\t"+pd[i].getquantity()+"\t"+pd[i].getprice()+"\t"+total);
        }
        System.out.printf("Grand Total:%d",Grand_total);
    }
}
public class BillingApplicationInvoice
{
  public static void main(String x[])
   {
  
     Product p1=new Product();
     p1.setid(1);
     p1.setname("LG");
     p1.setquantity(2);
     p1.setprice(100);


     Product p2=new Product();
     p2.setid(2);
     p2.setname("Jio");
     p2.setquantity(5);
     p2.setprice(150);


     Product p3=new Product();
     p3.setid(3);
     p3.setname("Tata");
     p3.setquantity(6);
     p3.setprice(10);


     Product p4=new Product();
     p4.setid(4);
     p4.setname("Apple");
     p4.setquantity(9);
     p4.setprice(75);


     Product p5=new Product();
     p5.setid(5);
     p5.setname("Sony");
     p5.setquantity(2);
     p5.setprice(100);
     
     Customer c=new Customer();
     c.setcid(1);
     c.setcname("Rushikesh");
     c.setccontact(1008);

     Bill bl = new Bill();
        bl.setOrder(c, p1, p2, p3,p4,p5);
        bl.generateInvoice();
    }
}
  
        
       