/*Example: WAP program for hotel review system we have to declare class name as 
Hotel with field id, name, type  ,Customer [] and mark hotel as POJO class and 
we have one more class name as Customer with field id,name,review and mark customer as POJO class 
you have to create Array of object of Hotel class with size 5 and every hotel contain 5 customer
 and customer should review to hotel and your task is 

Case 1: Add New Hotel and Add New Customer in hotel
Case 2: View all hotels with his customer details 
Case 3: Search hotel by its name 
Case 4: Show hotel wise review */

import java.util.*;
class Hotel
{
  private int id;
  private String name;
  private String type;
  private Customer[]custo;
  
  public void setid(int id)
  {
    this.id=id;
  }
  public int getid()
  {
    return id;
  }
  
  public void setname(String name)
  {
    this.name=name;
  }
  public String getname()
  {
    return name;
  }
  
  public void settype(String type)
  {
    this.type=type;
  }
  public String gettype()
  {
    return type;
  }
  
  public void setCustomer(Customer...custo)
  {
    this.custo=custo;
  }
  public Customer[] getCustomer()
  {
    return custo;
  }
}

class Customer
{
  private int id;
  private String name;
  private String review;
  
  public void setid(int id)
  {
    this.id=id;
  }
  public int getid()
  {
    return id;
  }
  
  public void setname(String name)
  {
    this.name=name;
  }
  public String getname()
  {
    return name;
  }
  
  public void setreview(String review)
  {
    this.review=review;
  }
  public String getreview()
  {
    return review;
  }
 }
 
 
 public class HotelReviewSystem
 {
   public static void main(String x[])
    {
	  int choice=0;
	  Hotel ht[]=new Hotel[5];
	  Scanner xyz=new Scanner(System.in);
	  
	  do{
	      System.out.printf("Enter 1 for Add New Hotel and Add New Customer in hotel \n Enter 2 for View all hotels with his customer details");
		  System.out.printf("Enter 3 for Search hotel by its name \n Enter 4 for Show hotel wise review ");
		  
	      System.out.printf("enter the choice");
	      choice=xyz.nextInt();
		  
		  switch (choice)
		   {
		      case 1:{
			            for(int i=0;i<ht.length;i++)
						{
						  ht[i]=new Hotel();
						  System.out.printf("Enter the Hotel Id,Name,Type");
						  int id=xyz.nextInt();
						  xyz.nextLine();
						  String name=xyz.nextLine();
						  String type=xyz.nextLine();
						  
						  xyz.nextLine();
						  
						  ht[i].setid(id);
						  
						  ht[i].setname(name);
						  
						  ht[i].settype(type);
						
						  Customer ct[]=new Customer[5];
						  
						for(int j=0;j<ct.length;j++)
						{
						  ct[j]=new Customer();
						  System.out.printf("Enter The Id,name,And Review of Customer");
						  int Id=xyz.nextInt();
						  xyz.nextLine();
						  String Name=xyz.nextLine();
						 
						  String review=xyz.nextLine();
						  
						  xyz.nextLine();
						  
						  ct[j].setid(Id);
						  
						  ct[j].setname(Name);
						  
						  ct[j].setreview(review);
						  
						}
						ht[i].setCustomer(ct);
						
						break;
						}
			        }
					
			  case 2:{
				         for(int i=0;i<ht.length;i++)
						 {
							  System.out.printf("\n HotelId \t HotelName \t HotelType");
							  System.out.println("\n"+ht[i].getid()+ "\t" +ht[i].getname()+ "\t" +ht[i].gettype());
						   
							  Customer cust[]=ht[i].getCustomer();
					     for(int j=0;j<cust.length;j++)
						 {
							  System.out.printf("Customerid \t customerName \t CustomerReview \t");
							  System.out.println("\n"+cust[j].getid()+ "\t" +cust[j].getname()+ "\t" +cust[j].getreview()+ "\n");
						 }
						 }
						 break;
			         }
					 
		      case 3:{
				          System.out.printf("Enter the Hotel Name");
						  String shotelname=xyz.nextLine();
						  
						  boolean flag=false;
						  for(int k=0;k<cust.length;k++)
						  {
						     if(shotelname==cust[k].getname())
							 {
								 flag=true;
                                 break;
							 }
						  }
                          if(flag==true)
						  {
                             System.out.printf("The Hotel Found");
                          }
                          else
                          {
                            System.out.printf("The Hotel NOT Found");
                          }		
                           break;						  
			        }
						  
              case 4:
                    for (int l = 0; i < ht.length; l++) 
					   {
                        System.out.println("Reviews for Hotel: " + ht[l].getName());
                        Customer[] custList = ht[i].getCustomer();
                        for (Customer cust : custList) {
                            System.out.println(cust.getName() + ": " + cust.getReview());
                        }
                    }
                    break;
		   }
	  }while(choice!=5);
	}
 }	
						  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	  